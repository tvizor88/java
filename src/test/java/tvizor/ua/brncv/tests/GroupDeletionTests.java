package tvizor.ua.brncv.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tvizor.ua.brncv.TestBase;

public class GroupDeletionTests  extends TestBase {

    @Test
    public void testDeleteGroup() throws Exception {
        gotoGroupPage();
        selectGroup();
        deleteSelectedGroups();
        returnToGroupPage();
    }

}


