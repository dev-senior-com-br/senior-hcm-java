package br.com.senior.hcm.payroll;

import br.com.senior.hcm.utils.Environment;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import br.com.senior.hcm.utils.ServiceException;

import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.Date;

/**
 * Exemplos de código do {@link PayrollClient PortariaClient}
 */
public class PortariaIT {

    private static PayrollClient client;

    @BeforeClass
    public static void beforeClass() throws ServiceException {
        client = new PayrollClient(System.getenv("TOKEN"), Environment.PROD);
    }

    @Test
    public void testPersonProvisoryCredential() throws ServiceException {
        if (!System.getenv().containsKey("LOBBYID")) {
            throw new RuntimeException("Necessário informar variável de ambiente LOBBYID com o id do lobby para gerar a credencial");
        }
        Long lobbyId = Long.valueOf(System.getenv("LOBBYID"));

        if (!System.getenv().containsKey("PERSONID")) {
            throw new RuntimeException("Necessário informar variável de ambiente PERSONID com o id da pessoa para gerar a credencial");
        }
        Long personId = Long.valueOf(System.getenv("PERSONID"));

        CreatePersonProvisoryCredential input = new CreatePersonProvisoryCredential(false, Collections.singletonList(new InformationCardCredentialRecord(CardTechnology.BARCODE_CARD, 1L)), new Date().toInstant().plus(1, ChronoUnit.DAYS), personId, lobbyId);
        ProvisoryCredentialRecord output = client.createPersonProvisoryCredentialCard(input);
        Assert.assertNotNull(output);
    }

    @Test
    public void testVisitorProvisoryCredential() throws ServiceException {
        if (!System.getenv().containsKey("ROLEID")) {
            throw new RuntimeException("Necessário informar variável de ambiente ROLEID com o id do papel com as permissões que o visitante irá possuir");
        }
        Long roleId = Long.valueOf(System.getenv("ROLEID"));

        if (!System.getenv().containsKey("VISITORID")) {
            throw new RuntimeException("Necessário informar variável de ambiente VISITORID com o id do visitante para gerar a credencial");
        }
        Long visitorId = Long.valueOf(System.getenv("VISITORID"));

        Long schedullingId = null;
        if (!System.getenv().containsKey("SCHEDULLINGID")) {
            System.out.println("Não foi informado o agendamento, será considerado uma visita não agendada");
        } else {
            schedullingId = Long.valueOf(System.getenv("PERSONID"));
        }

        CreateVisitorProvisoryCredential input = new CreateVisitorProvisoryCredential(false, Collections.singletonList(new InformationCardCredentialRecord(CardTechnology.BARCODE_CARD, 1L)), new Date().toInstant().plus(1, ChronoUnit.DAYS), roleId, new Visitor( visitorId ), schedullingId);
        ProvisoryCredentialRecord output = client.createVisitorProvisoryCredentialCard(input);
        Assert.assertNotNull(output);
    }
}