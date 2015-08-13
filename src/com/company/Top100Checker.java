package com.company;

import com.gargoylesoftware.htmlunit.Page;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Alex on 13.08.2015.
 */
public class Top100Checker extends BrawzerFactory {


    @Test (dataProvider ="formUrls")
    public void ferstTest(String formUrl) throws InterruptedException {
        driver.get("https://www.pdffiller.com"+ formUrl);
        Assert.assertTrue(driver.getCurrentUrl().contains(formUrl));
        Thread.sleep(1000);

    }

    @DataProvider(name = "formUrls")
    public static Object[][] landings() {
        return new Object[][] {
                { "/6962253-fw9--2014pdf-Form-W-9-Rev-December-2014-User-Forms"},
                { "/6959008-212239pdf-DS-11-Application-for-a-US-Passport---US-Department-of-State-User-Forms"},
                {  "/100264019-212241pdf-DS-82---US-Passport-Renewal-Application---Department-of-State-" },
                { "/100101920-Revised-NBI-Clearance-Application-Form-V17-blue2pdf-Fillable-THIS-FORM-IS-NOT-FOR-SALE---NBI-User-Forms" },
                { "/15971119-6-181pdf-FOID-card-application---Illinois-State-Police-Various-Fillable-Forms"},
                {"/6961858-fw2--2014pdf-2014-Form-W-2-User-Forms"},
                {"/41772446-f1099msc--2014pdf-2014-Form-1099-MISC---Internal-Revenue-Service-Various-Fillable-Forms"},
                {"/6961804-f4506t--2014pdf-Form-4506-T-Rev-August-2014-User-Forms"},
                {"/6957914-1500_claim_form_2012_02pdf-CMS-1500-02-12---Health-Insurance-Claim-Form-User-Forms"},
                {"/6961732-f941--2014pdf-Form-941-Rev-January-2014-User-Forms"},
                {"/6960342-25pdf-Acord-25-201401---Certificate-of-Liability-Insurance-User-Forms"},
                {"/100012429-printable-pay-stubpdf-Free-Employee-Pay-Stub---Pay-Stub-Template-User-Forms--paystubtemplates"},
                {"/100068730-C-2SampleLEASEpdf-Fillable-BASIC-RENTAL-AGREEMENT-OR-RESIDENTIAL-LEASE-User-Forms--dca-ga"},
        };
    }

    @DataProvider(name = "proxies")
        public static Object[][] proxies() {
        return new Object[][] {
                {"173.214.164.53", 5982},
                {"173.214.164.55", 5982},
                {"173.214.164.60", 5982},
                {"68.168.220.254", 5982},
                {"199.231.185.233", 5982},
        };
    }


}
