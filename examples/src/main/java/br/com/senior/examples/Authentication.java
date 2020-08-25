package br.com.senior.examples;

import br.com.senior.core.authentication.AuthenticationClient;
import br.com.senior.core.authentication.pojos.LoginInput;
import br.com.senior.core.authentication.pojos.LoginOutput;
import br.com.senior.core.base.ServiceException;

public class Authentication {

    public static String login() throws ServiceException {
        final String username = System.getenv("SENIOR_USERNAME");
        final String password = System.getenv("PASS");

        AuthenticationClient authClient = new AuthenticationClient();
        LoginOutput output = authClient.login(new LoginInput(username, password));
        return output.getJsonToken().getAccess_token();
    }
}
