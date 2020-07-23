package br.com.senior.hcm.payroll;

import br.com.senior.core.base.ServiceException;
import br.com.senior.hcm.BaseTest;
import br.com.senior.hcm.payroll.pojos.EmployeeListQueryInput;
import br.com.senior.hcm.payroll.pojos.EmployeeListQueryOutput;
import br.com.senior.hcm.payroll.pojos.EmployeeQueryInput;
import br.com.senior.hcm.payroll.pojos.EmployeeQueryOutput;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PayrollClientTest extends BaseTest {

    private String token;
    private PayrollClient client;

    @Before
    public void before() throws ServiceException {
        this.token = login().getJsonToken().getAccess_token();
        this.client = new PayrollClient(this.token);
    }

    @Test
    public void employeeListAndQuery() throws ServiceException {
        EmployeeListQueryOutput output = this.client.employeeListQuery(new EmployeeListQueryInput());
        Assert.assertTrue(output.getResult().getCountResult() > 0);
        String employeeId = output.getResult().getEmployees().get(0).getEmployeeId();
        EmployeeQueryInput input = new EmployeeQueryInput(employeeId, new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        this.client.employeeQuery(input);
    }
}