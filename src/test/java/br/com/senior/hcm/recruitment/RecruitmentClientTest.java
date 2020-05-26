package br.com.senior.hcm.recruitment;

import br.com.senior.core.base.ServiceException;
import br.com.senior.hcm.BaseTest;
import br.com.senior.hcm.recruitment.pojos.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

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
        payload.setSituation(Arrays.asList(VacancySituationDto.IN_PROGRESS));
        ListVacanciesOutput output = client.listVacancies(payload);
        Assert.assertNotNull(output);
    }

    @Test
    public void vacancyDetails() throws ServiceException {
        VacancyDetailsInput payload = new VacancyDetailsInput();
        payload.setId("9E8BC3478C8040558FA06C7C85FF3B28");
        VacancyDetailsOutput output = client.vacancyDetails(payload);
        Assert.assertNotNull(output);
    }

    @Test
    public void vacancyDetailsSummary() throws ServiceException {
        VacancyDetailsSummaryInput payload = new VacancyDetailsSummaryInput();
        payload.setVacancyId("9E8BC3478C8040558FA06C7C85FF3B28");
        VacancyDetailsSummaryOutput output = client.vacancyDetailsSummary(payload);
        Assert.assertNotNull(output);
    }

    @Test
    public void searchPersons() throws ServiceException {
        SearchPersonsInput payload = new SearchPersonsInput();
        payload.setReferenceDate("2020-05-26");
        SearchPersonsOutput output = client.searchPersons(payload);
        Assert.assertNotNull(output);
    }
}
