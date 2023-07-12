package businessfunctions;

import pagerepo.UpdateLocationPage;

public class UpdateLocationUtil extends BaseClass {

	public static void updateLocation(String zipcode) {
		UpdateLocationPage.clickLocationIcon();
		UpdateLocationPage.enterZipCode(zipcode);
		UpdateLocationPage.clickSubmitButton();
		
	}
}
