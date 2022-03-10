package com.vyTrack.tests.base;

import com.vyTrack.utilities.BrowserUtils;
import com.vyTrack.utilities.Driver;
import com.vyTrack.utilities.VytrackUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class US4_AccessToVehicleContracts extends TestBase{

    @DataProvider(name = "roles")
    public Object[][] provideRoles(){
        return new Object[][]{{"salesmanager"},{"storemanager"},{"driver"}};
    }

    @Test(dataProvider = "roles")
    public void testName(String role) {
        if (role.equals("salesmanager"))
            VytrackUtils.loginAsSalesManager();
        else if (role.equals("storemanager"))
            VytrackUtils.loginAsStoreManager();
        else VytrackUtils.loginAsDriver();

        BrowserUtils.verifyTitle(Driver.getDriver(), "Dashboard");
    }
}

