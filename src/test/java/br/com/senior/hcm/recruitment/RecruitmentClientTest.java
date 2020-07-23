package br.com.senior.hcm.recruitment;

import br.com.senior.core.base.ServiceException;
import br.com.senior.hcm.BaseTest;
import br.com.senior.hcm.recruitment.pojos.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Collections;

public class RecruitmentClientTest extends BaseTest {

    private String token;
    private RecruitmentClient client;

    @Before
    public void before() throws ServiceException {
        this.token = login().getJsonToken().getAccess_token();
        this.client = new RecruitmentClient(this.token);
    }

    @Test
    public void listVacancies() throws ServiceException {
        ListVacanciesInput payload = new ListVacanciesInput();
        payload.setSituation(Collections.singletonList(VacancySituationDto.IN_PROGRESS));
        payload.setSize(10);
        ListVacanciesOutput output = client.listVacancies(payload);
        Assert.assertNotNull(output);
    }

    @Test
        public void vacancyDetails() throws ServiceException {
        VacancyDetailsInput payload = new VacancyDetailsInput("9E8BC3478C8040558FA06C7C85FF3B28");
        VacancyDetailsOutput output = client.vacancyDetails(payload);
        Assert.assertNotNull(output);
    }

    @Test
    @Ignore("Teste depende de usuário externo, não pode ser o mesmo das outras primitivas")
    public void vacancyDetailsSummary() throws ServiceException {
        VacancyDetailsSummaryInput payload = new VacancyDetailsSummaryInput("9E8BC3478C8040558FA06C7C85FF3B28");
        VacancyDetailsSummaryOutput output = client.vacancyDetailsSummary(payload);
        Assert.assertNotNull(output);
    }

    @Test
    public void searchPersons() throws ServiceException {
        SearchPersonsInput payload = new SearchPersonsInput("2020-05-26");
        SearchPersonsOutput output = client.searchPersons(payload);
        Assert.assertNotNull(output);
    }
}
