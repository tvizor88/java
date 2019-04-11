package tvizor.ua.brncv.tests;

import org.testng.annotations.Test;
import tvizor.ua.brncv.appManager.TestBase;

public class GroupDeletionTests  extends TestBase {

    @Test
    public void testDeleteGroup() throws Exception {
        app.gotoGroupPage();
        app.selectGroup();
        app.deleteSelectedGroups();
        app.returnToGroupPage();
    }

}


