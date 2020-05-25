package br.com.senior.hcm.dependent;

import br.com.senior.core.base.BaseClient;
import br.com.senior.core.base.Environment;
import br.com.senior.core.base.ServiceException;
import br.com.senior.hcm.dependent.pojo.DependentQueryInput;
import br.com.senior.hcm.dependent.pojo.DependentQueryOutput;

/**
 * Cliente do serviço de  <a href="https://dev.senior.com.br/apis/hcm_depentent">Dependente</a>
 */
public class DependentClient extends BaseClient {

    String token;


    /**
     * Construtor
     */
    public DependentClient(String token) {
        super("hcm", "dependent");
        this.token = token;
    }

    /**
     * Construtor
     *
     * @param env - Variáveis de ambiente
     */
    public DependentClient(String token, Environment env) {
        super("hcm", "dependent", env);
        this.token = token;
    }

    public DependentQueryOutput dependentQuery(DependentQueryInput payload) throws ServiceException {
        return execute(getQueriesUrl("dependentQuery"), payload, token, DependentQueryOutput.class);
    }

}
