package edu.dmacc.codedsm.tasker;

import edu.dmacc.codedsm.tasker.objects.Task;
import edu.dmacc.codedsm.tasker.objects.User;
import java.util.List;

public class PerformAtOffice extends TaskPerformer {

    @Override
    public void performTask(Task task, User user) {
        System.out.println("Perform At Office");
    }

    public PerformAtOffice() {
    }

}
