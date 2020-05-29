package br.com.senior.hcm.dependent;

import br.com.senior.core.base.ServiceException;
import br.com.senior.hcm.BaseTest;
import br.com.senior.hcm.dependent.pojo.DependentListQueryInput;
import br.com.senior.hcm.dependent.pojo.DependentListQueryOuput;
import br.com.senior.hcm.dependent.pojo.DependentQueryInput;
import br.com.senior.hcm.dependent.pojo.DependentQueryOutput;
import org.junit.Before;
import org.junit.Test;

public class DependentClientTest extends BaseTest {

    private String token;
    private DependentClient client;

    @Before
    public void before() throws ServiceException {
        this.token = login().getJsonToken().getAccess_token();
        this.client = new DependentClient(this.token);
    }

    @Test
    public void dependentQuery() throws ServiceException {
        DependentQueryInput input = new DependentQueryInput("2182988098EE44F887F88BBC85F300A9");
        DependentQueryOutput output = client.dependentQuery(input);
        System.out.println(output);
    }

    @Test
    public void dependentListQuery() throws ServiceException {
        DependentListQueryInput input = new DependentListQueryInput("9E8BC3478C8040558FA06C7C85FF3B28");
        DependentListQueryOuput output = client.dependentListQuery(input);
        System.out.println(output);
    }
}
