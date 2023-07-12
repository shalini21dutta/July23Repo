package businessfunctions;

import pagerepo.RegisterUserPage;

public class RegisterUserUtil extends BaseClass{
	
	public static void registerUser(String email,String pwd, String fullname,String mobileNo,String birthDate, 
			String doorNo,String Location,String city,String state,String zipcode) {
		
		RegisterUserPage.clickLogin();
		RegisterUserPage.enterEmail(email);
		RegisterUserPage.enterPassword(pwd);
		RegisterUserPage.enterFullName(fullname);
		RegisterUserPage.enterMobileNo(mobileNo);
		RegisterUserPage.selectGender();
		RegisterUserPage.enterBirthDate(birthDate);
		RegisterUserPage.enterDoorNo(doorNo);
		RegisterUserPage.enterLocation(Location);
		RegisterUserPage.enterCity(city);
		RegisterUserPage.enterState(state);
		RegisterUserPage.enterZipCode(zipcode);
		RegisterUserPage.clickRegisterButton();
	}

}
