package tvizor.ua.brncv.tests;

import org.testng.annotations.Test;
import tvizor.ua.brncv.model.TestBase;

public class GroupDeletionTests  extends TestBase {

    @Test
    public void testDeleteGroup() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }

}


