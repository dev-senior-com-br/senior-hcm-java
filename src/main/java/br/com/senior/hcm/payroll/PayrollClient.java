package br.com.senior.hcm.payroll;

import br.com.senior.core.base.BaseClient;
import br.com.senior.core.base.Environment;
import br.com.senior.core.base.ServiceException;
import br.com.senior.hcm.payroll.pojos.*;

/**
 * Cliente do serviço de  <a href="https://dev.senior.com.br/apis/hcm_payroll">Payroll</a>
 */
public class PayrollClient extends BaseClient {

    private final String token;

    /**
     * Construtor
     */
    public PayrollClient(String token) {
        super("hcm", "payroll");
        this.token = token;
    }

    /**
     * Construtor
     *
     * @param env - Variáveis de ambiente
     */
    public PayrollClient(String token, Environment env) {
        super("hcm", "payroll", env);
        this.token = token;
    }


    /**
     * Solicitação para acessar um arquivo
     *
     * @param payload - Payload de entrada para a solicitação de um arquivo
     * @return - Payload de saída com os dados da solicitação do arquivo.
     * @throws ServiceException - Erro tratado de serviço
     */
    public BlobServiceRequestAccessOutput blobServiceRequestAccess(BlobServiceRequestAccessInput payload) throws ServiceException {
        return execute(getActionsUrl("blobServiceRequest"), payload, token, BlobServiceRequestAccessOutput.class);
    }

    /**
     * Retorna os dados de admissão do colaborador
     *
     * @param payload - Payload de entrada com os dados para a consulta de admissão do colaborador
     * @return - Payload de saída com os dados de admissão do colaborador
     * @throws ServiceException - Erro tratado de serviço
     */
    public EmployeeQueryOutput employeeQuery(EmployeeQueryInput payload) throws ServiceException {
        return execute(getQueriesUrl("employeeQuery"), payload, token, EmployeeQueryOutput.class);
    }

    /**
     * Consulta uma lista de colaboradores com paginação e filtros
     *
     * @param payload - Payload de entrada com os dados para a consulta dos colaboradores
     * @return - Payload de saída com os dados dos colaboradores
     * @throws ServiceException - Erro tratado de serviço
     */
    public EmployeeListQueryOutput employeeListQuery(EmployeeListQueryInput payload) throws ServiceException {
        return execute(getQueriesUrl("employeeListQuery"), payload, token, EmployeeListQueryOutput.class);
    }
}
