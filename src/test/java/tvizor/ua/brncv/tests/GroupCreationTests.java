package tvizor.ua.brncv.tests;

import org.testng.annotations.Test;
import tvizor.ua.brncv.testData.GroupData;
import tvizor.ua.brncv.TestBase;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("testgroup", "test3", "test3"));
        submitGroupCreation();
        returnToGroupPage();
    }


}
