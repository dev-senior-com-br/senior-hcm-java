package br.com.senior.examples.recruitment;

import br.com.senior.examples.Authentication;
import br.com.senior.core.base.ServiceException;
import br.com.senior.hcm.recruitment.RecruitmentClient;
import br.com.senior.hcm.recruitment.pojos.ListVacanciesInput;
import br.com.senior.hcm.recruitment.pojos.ListVacanciesOutput;
import br.com.senior.hcm.recruitment.pojos.SearchPersonsInput;
import br.com.senior.hcm.recruitment.pojos.SearchPersonsOutput;
import br.com.senior.hcm.recruitment.pojos.VacancyDetailsInput;
import br.com.senior.hcm.recruitment.pojos.VacancyDetailsOutput;
import br.com.senior.hcm.recruitment.pojos.VacancyDetailsSummaryInput;
import br.com.senior.hcm.recruitment.pojos.VacancyDetailsSummaryOutput;
import br.com.senior.hcm.recruitment.pojos.VacancySituationDto;

import java.util.Collections;

public class RecruitmentClientExample {
    private static RecruitmentClient client;

    public static void main(String[] args) throws ServiceException {
        client = new RecruitmentClient(Authentication.login());

        SearchPersonsOutput persons = searchPersons();
        System.out.println(persons);

        ListVacanciesOutput vacancies = listVacancies();

        if (!vacancies.getVacancies().isEmpty()) {
            System.out.println(vacancies);
            VacancyDetailsOutput vacancyDetails = vacancyDetails(vacancies.getVacancies().get(0).getId());
            System.out.println(vacancyDetails);
            VacancyDetailsSummaryOutput vacancyDetailsSummary = vacancyDetailsSummary(vacancies.getVacancies().get(0).getId());
            System.out.println(vacancyDetailsSummary);
        }
    }

    private static ListVacanciesOutput listVacancies() throws ServiceException {
        ListVacanciesInput payload = new ListVacanciesInput();
        payload.setSituation(Collections.singletonList(VacancySituationDto.IN_PROGRESS));
        payload.setSize(10);
        return client.listVacancies(payload);
    }

    private static VacancyDetailsOutput vacancyDetails(String vacancyId) throws ServiceException {
        VacancyDetailsInput payload = new VacancyDetailsInput(vacancyId);
        return client.vacancyDetails(payload);
    }

    private static VacancyDetailsSummaryOutput vacancyDetailsSummary(String vacancyId) throws ServiceException {
        VacancyDetailsSummaryInput payload = new VacancyDetailsSummaryInput(vacancyId);
        return client.vacancyDetailsSummary(payload);
    }

    private static SearchPersonsOutput searchPersons() throws ServiceException {
        SearchPersonsInput payload = new SearchPersonsInput("2020-05-26");
        return client.searchPersons(payload);
    }
}
