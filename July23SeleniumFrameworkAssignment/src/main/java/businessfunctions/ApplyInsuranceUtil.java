package businessfunctions;

import pagerepo.ApplyInsurancePage;

public class ApplyInsuranceUtil {
	
	public static void applyInsurance(String coverageAmt,String BirthDate,String HeightFeet,String HeightInch,String Weight) {
		ApplyInsurancePage.clickInsurance();
		ApplyInsurancePage.clickApplyInsurance();
		
		ApplyInsurancePage.clickCoverageAmount(coverageAmt);
		ApplyInsurancePage.enterBirthDate(BirthDate);
		ApplyInsurancePage.selectGender();
		ApplyInsurancePage.enterHeightFeet(HeightFeet);
		ApplyInsurancePage.enterHeightInches(HeightInch);
		ApplyInsurancePage.enterWeightLbs(Weight);
		ApplyInsurancePage.clickGetInstantQuotes();

	}

}
