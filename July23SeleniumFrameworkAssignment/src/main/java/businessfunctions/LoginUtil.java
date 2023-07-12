package businessfunctions;

import pagerepo.LoginPage;

public class LoginUtil extends BaseClass{
	
	public static void login(String email,String pwd) {
		
		LoginPage.clickLogin();
		LoginPage.enterEmail(email);
		LoginPage.enterPassword(pwd);
		LoginPage.clickLoginButton();
	}

}
