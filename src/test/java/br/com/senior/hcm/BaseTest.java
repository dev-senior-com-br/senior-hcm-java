package br.com.senior.hcm;

import br.com.senior.core.authentication.AuthenticationClient;
import br.com.senior.core.authentication.pojos.LoginInput;
import br.com.senior.core.authentication.pojos.LoginOutput;
import br.com.senior.core.base.ServiceException;

public class BaseTest {

    protected static LoginOutput login() throws ServiceException {
        LoginInput input = new LoginInput(System.getenv("SENIOR_USERNAME"), System.getenv("PASSWORD"));
        return new AuthenticationClient().login(input);
    }
}
