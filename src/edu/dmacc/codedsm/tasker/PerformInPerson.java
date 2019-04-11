package edu.dmacc.codedsm.tasker;

import edu.dmacc.codedsm.tasker.objects.Task;
import edu.dmacc.codedsm.tasker.objects.User;

public class PerformInPerson extends TaskPerformer {

    @Override
    public void performTask(Task task, User user) {
        System.out.println("Perform In Person");
    }

    // I interpreted "perform in person" as opposed to "perform at office" as being going to a site to perform a task by oneself

    public PerformInPerson() {
    }

}
