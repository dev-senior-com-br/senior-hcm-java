package br.com.senior.hcm.recruitment;

import br.com.senior.core.base.BaseClient;
import br.com.senior.core.base.Environment;
import br.com.senior.core.base.ServiceException;
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

    /**
     * Retorna todas as vagas existentes.
     * As vagas retornadas são ordenadas pelos seguintes campos:
     * - Vaga em destaque
     * - Título da vaga (ascendente)
     * - Local  da vaga (ascendente)
     *
     * @param payload - Payload de entrada para realizar a consulta dos dados das vagas
     * @return - Payload de saída com os dados de todas as vagas existentes
     * @throws ServiceException - Erro tratado de serviço
     */
    public ListVacanciesOutput listVacancies(ListVacanciesInput payload) throws ServiceException {
        return execute(getActionsUrl("listVacancies"), payload, token, ListVacanciesOutput.class);
    }

    /**
     * Retorna os detalhes de uma vaga
     *
     * @param payload - Payload de entrada com os dados para realizar a consulta dos detalhes de uma vaga
     * @return - Payload de saída com os dados dos detalhes de uma vaga
     * @throws ServiceException - Erro tratado de serviço
     */
    public VacancyDetailsOutput vacancyDetails(VacancyDetailsInput payload) throws ServiceException {
        return execute(getActionsUrl("vacancyDetails"), payload, token, VacancyDetailsOutput.class);
    }

    /**
     * Retorna o resumo dos detalhes de uma vaga
     *
     * @param payload - Payload de entrada com os dados para realizar a consulta do resumo dos detalhes de uma vaga
     * @return - Payload de saída com os dados do resumo dos detalhes de uma vaga
     * @throws ServiceException - Erro tratado de serviço
     */
    public VacancyDetailsSummaryOutput vacancyDetailsSummary(VacancyDetailsSummaryInput payload) throws ServiceException {
        return execute(getActionsUrl("vacancyDetailsSummary"), payload, token, VacancyDetailsSummaryOutput.class);
    }

    /**
     * Busca todas as pessoas contendo a expressão informada em seu nome e pelo menos um contrato de colaborador ativo
     * na data de referência. Caso não seja informado o parâmetro 'q' serão listados todos os usuários com pelo menos um
     * contrato ativo na data de referência.
     *
     * @param payload - Payload de entrada com os dados para consulta de pessoas.
     * @return - Payload de saída com os dados das pessoas.
     * @throws ServiceException - Erro tratado de serviço
     */
    public SearchPersonsOutput searchPersons(SearchPersonsInput payload) throws ServiceException {
        return execute(getActionsUrl("searchPersons"), payload, token, SearchPersonsOutput.class);
    }
}
