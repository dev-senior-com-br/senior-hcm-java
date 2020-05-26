package br.com.senior.hcm.payroll;

import br.com.senior.core.base.Environment;
import br.com.senior.core.base.ServiceException;
import br.com.senior.hcm.BaseTest;
import br.com.senior.hcm.payroll.pojos.EmployeeQueryInput;
import br.com.senior.hcm.payroll.pojos.EmployeeQueryOutput;
import org.junit.Before;
import org.junit.Test;

import java.text.DateFormat;
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
    public void employeeQuery() throws ServiceException {
        EmployeeQueryInput input = new EmployeeQueryInput();
        input.setEmployeeId("2182988098EE44F887F88BBC85F300A9");
        input.setReferenceDate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        EmployeeQueryOutput employeeQueryOutput = this.client.employeeQuery(input);
        System.out.println(employeeQueryOutput);
    }

}
