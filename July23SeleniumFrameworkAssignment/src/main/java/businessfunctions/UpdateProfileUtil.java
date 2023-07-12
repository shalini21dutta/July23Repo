package businessfunctions;

import pagerepo.UpdateProfilePage;

public class UpdateProfileUtil {
	
	public static void updateProfile(String fullname) {
		UpdateProfilePage.clickMyAccount();
		UpdateProfilePage.clickMyProfile();
		UpdateProfilePage.clearFullName();
		UpdateProfilePage.enterFullName(fullname);
		UpdateProfilePage.clickUpdateProfile();
		UpdateProfilePage.clickMyAccount();
		UpdateProfilePage.clickDashboard();
	}

}
