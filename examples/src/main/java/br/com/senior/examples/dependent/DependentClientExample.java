package br.com.senior.examples.dependent;

import br.com.senior.examples.Authentication;
import br.com.senior.core.base.ServiceException;
import br.com.senior.hcm.dependent.DependentClient;
import br.com.senior.hcm.dependent.pojos.DependentListQueryInput;
import br.com.senior.hcm.dependent.pojos.DependentListQueryOuput;
import br.com.senior.hcm.dependent.pojos.DependentQueryInput;
import br.com.senior.hcm.dependent.pojos.DependentQueryOutput;

public class DependentClientExample {

    private static final String employeeId = "CB86864C9BA94F27A3259F24EDCC6A68";
    private static DependentClient client;

    public static void main(String[] args) throws ServiceException {
        client = new DependentClient(Authentication.login());

        DependentListQueryOuput dependents = dependentListQuery(employeeId);
        if (!dependents.getResult().getDependents().isEmpty()) {
            System.out.println(dependents);
            DependentQueryOutput dependent = dependentQuery(dependents.getResult().getDependents().get(0).getId());
            System.out.println(dependent);
        }
    }

    private static DependentListQueryOuput dependentListQuery(String employeeId) throws ServiceException {
        DependentListQueryInput input = new DependentListQueryInput(employeeId);
        return client.dependentListQuery(input);
    }

    private static DependentQueryOutput dependentQuery(String dependentId) throws ServiceException {
        return client.dependentQuery(new DependentQueryInput(dependentId));
    }
}
