package br.com.senior.hcm.dependent;

import br.com.senior.core.base.ServiceException;
import br.com.senior.hcm.BaseTest;
import br.com.senior.hcm.dependent.pojos.DependentListQueryInput;
import br.com.senior.hcm.dependent.pojos.DependentListQueryOuput;
import br.com.senior.hcm.dependent.pojos.DependentQueryInput;
import br.com.senior.hcm.dependent.pojos.DependentQueryOutput;
import br.com.senior.hcm.payroll.PayrollClient;
import br.com.senior.hcm.payroll.pojos.EmployeeListQueryInput;
import br.com.senior.hcm.payroll.pojos.EmployeeListQueryOutput;
import org.junit.Assert;
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
    public void dependentListQuery() throws ServiceException {
        String employeeId = getSomeEmployeeId();
        DependentListQueryInput input = new DependentListQueryInput(employeeId);
        DependentListQueryOuput output = client.dependentListQuery(input);
        if (output.getResult().getCountResult() > 0) {
            DependentQueryOutput dependentOutput = client.dependentQuery(new DependentQueryInput(output.getResult().getDependents().get(0).getId()));
            Assert.assertNotNull(dependentOutput.getResult());
        }
    }

    private String getSomeEmployeeId() throws ServiceException {
        EmployeeListQueryOutput output = new PayrollClient(this.token).employeeListQuery(new EmployeeListQueryInput());
        Assert.assertTrue(output.getResult().getCountResult() > 0);
        return output.getResult().getEmployees().get(0).getEmployeeId();
    }
}
