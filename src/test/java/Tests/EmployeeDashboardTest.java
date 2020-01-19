package Tests;

import base.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.EmployeeDashboard;

public class EmployeeDashboardTest extends TestBase {
    EmployeeDashboard

    @BeforeMethod
    public void  setUp(){
        initializer();
        homePage = new HomePage();
        employeeDashboardPage = new EmployeeDashboardPage();

        @AfterMethod(alwaysRun = true)
                public void tearDown() {driver.quit();}
                


    }

}
