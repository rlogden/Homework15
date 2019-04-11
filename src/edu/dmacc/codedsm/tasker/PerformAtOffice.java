package edu.dmacc.codedsm.tasker;

import edu.dmacc.codedsm.tasker.objects.Task;
import edu.dmacc.codedsm.tasker.objects.User;
import java.util.List;

public class PerformAtOffice extends TaskPerformer {

    @Override
    public void performTask(Task task, User user) {
        System.out.println("Perform At Office");
    }

    @Override
    public void performTask(Task task, List<User> users) {
        System.out.println("Perform at Office");
    }

    // Performing a task at the office can be done alone or with a group of co-workers

    public PerformAtOffice() {
    }
}
