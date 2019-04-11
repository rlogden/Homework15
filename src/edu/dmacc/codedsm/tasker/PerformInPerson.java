package edu.dmacc.codedsm.tasker;

import edu.dmacc.codedsm.tasker.objects.Task;
import edu.dmacc.codedsm.tasker.objects.User;

public class PerformInPerson extends TaskPerformer {

    @Override
    public void performTask(Task task, User user) {
        System.out.println("Perform In Person");
    }

    public PerformInPerson() {
    }

}
