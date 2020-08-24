package br.com.senior.examples.payroll;

import br.com.senior.examples.Authentication;
import br.com.senior.core.base.ServiceException;
import br.com.senior.hcm.payroll.PayrollClient;
import br.com.senior.hcm.payroll.pojos.EmployeeListQueryInput;
import br.com.senior.hcm.payroll.pojos.EmployeeListQueryOutput;
import br.com.senior.hcm.payroll.pojos.EmployeeQueryInput;
import br.com.senior.hcm.payroll.pojos.EmployeeQueryOutput;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PayrollClientExample {

    private static PayrollClient client;

    public static void main(String[] args) throws ServiceException {
        client = new PayrollClient(Authentication.login());
        EmployeeListQueryOutput employeeList = employeeListAndQuery();

        if (!employeeList.getResult().getEmployees().isEmpty()) {
            System.out.println(employeeList);
            EmployeeQueryOutput employee = employeeQuery(employeeList.getResult().getEmployees().get(0).getEmployeeId());
            System.out.println(employee);
        }
    }

    private static EmployeeListQueryOutput employeeListAndQuery() throws ServiceException {
        return client.employeeListQuery(new EmployeeListQueryInput());
    }

    private static EmployeeQueryOutput employeeQuery(String employeeId) throws ServiceException {
        EmployeeQueryInput input = new EmployeeQueryInput(employeeId, new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        return client.employeeQuery(input);
    }
}