package br.com.senior.hcm.recruitment;

import br.com.senior.core.base.BaseClient;
import br.com.senior.core.base.Environment;
import br.com.senior.core.base.ServiceException;
import br.com.senior.hcm.payroll.pojos.EmployeeListQueryInput;
import br.com.senior.hcm.payroll.pojos.EmployeeListQueryOutput;
import br.com.senior.hcm.recruitment.pojos.*;

/**
 * Cliente do serviço de  <a href="https://dev.senior.com.br/apis/hcm_recruitment">Recrutamento</a>
 */
public class RecruitmentClient extends BaseClient {

    String token;

    /**
     * Construtor
     */
    public RecruitmentClient(String token) {
        super("hcm", "recruitment");
        this.token = token;
    }

    /**
     * Construtor
     *
     * @param env - Variáveis de ambiente
     */
    public RecruitmentClient(String token, Environment env) {
        super("hcm", "recruitment", env);
        this.token = token;
    }

    public ListVacanciesOutput listVacancies(ListVacanciesInput payload) throws ServiceException {
        return execute(getActionsUrl("listVacancies"), payload, token, ListVacanciesOutput.class);
    }

    public VacancyDetailsOutput vacancyDetails(VacancyDetailsInput payload) throws ServiceException {
        return execute(getActionsUrl("vacancyDetails"), payload, token, VacancyDetailsOutput.class);
    }

    public VacancyDetailsSummaryOutput vacancyDetailsSummary(VacancyDetailsSummaryInput payload) throws ServiceException {
        return execute(getActionsUrl("vacancyDetailsSummary"), payload, token, VacancyDetailsSummaryOutput.class);
    }

    public SearchPersonsOutput searchPersons(SearchPersonsInput payload) throws ServiceException {
        return execute(getActionsUrl("searchPersons"), payload, token, SearchPersonsOutput.class);
    }

    public EmployeeListQueryOutput employeeListQuery(EmployeeListQueryInput payload) throws ServiceException {
        return execute(getActionsUrl("employeeList"), payload, token, EmployeeListQueryOutput.class);
    }

}
