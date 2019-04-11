package tvizor.ua.brncv.tests;

import org.testng.annotations.Test;
import tvizor.ua.brncv.model.GroupData;
import tvizor.ua.brncv.appManager.TestBase;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("testgroup", "test3", "test3"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }


}
