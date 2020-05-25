package br.com.senior.hcm.payroll;

import br.com.senior.core.base.BaseClient;
import br.com.senior.core.base.Environment;
import br.com.senior.core.base.ServiceException;
import br.com.senior.hcm.payroll.pojos.BlobServiceRequestAccessInput;
import br.com.senior.hcm.payroll.pojos.BlobServiceRequestAccessOutput;
import br.com.senior.hcm.payroll.pojos.EmployeeQueryInput;
import br.com.senior.hcm.payroll.pojos.EmployeeQueryOutput;

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

    public BlobServiceRequestAccessOutput blobServiceRequestAccess(BlobServiceRequestAccessInput payload) throws ServiceException {
        return execute(getActionsUrl("blobServiceRequest"), payload, token, BlobServiceRequestAccessOutput.class);
    }

    public EmployeeQueryOutput employeeQuery(EmployeeQueryInput payload) throws ServiceException {
        return execute(getQueriesUrl("employeeQuery"), payload, token, EmployeeQueryOutput.class);
    }
}
