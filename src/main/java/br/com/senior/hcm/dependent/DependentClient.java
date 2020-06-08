package br.com.senior.hcm.dependent;

import br.com.senior.core.base.BaseClient;
import br.com.senior.core.base.Environment;
import br.com.senior.core.base.ServiceException;
import br.com.senior.hcm.dependent.pojo.DependentListQueryInput;
import br.com.senior.hcm.dependent.pojo.DependentListQueryOuput;
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

    /**
     * Retorna as informações do dependente
     *
     * @param payload - Payload de entrada com os dados para consulta do dependente
     * @return - Payload de saída com os dados do dependente
     * @throws ServiceException - Erro tratado do serviço
     */
    public DependentQueryOutput dependentQuery(DependentQueryInput payload) throws ServiceException {
        return execute(getQueriesUrl("dependentQuery"), payload, token, DependentQueryOutput.class);
    }

    /**
     * Consulta de dependente e suas dependências
     *
     * @param payload - Payload de entrada com os dados para consulta dos dependentes
     * @return - Payload de saída com os dados dos dependentes
     * @throws ServiceException - Erro tratado do serviço
     */
    public DependentListQueryOuput dependentListQuery(DependentListQueryInput payload) throws ServiceException {
        return execute(getQueriesUrl("dependentListQuery"), payload, token, DependentListQueryOuput.class);
    }

}
