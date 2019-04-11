package edu.dmacc.codedsm.tasker;

import edu.dmacc.codedsm.tasker.objects.Task;
import edu.dmacc.codedsm.tasker.objects.User;
import java.util.List;

public class PerformWithGroup extends TaskPerformer {

    @Override
    public void performTask(Task task, List<User> users) {
        System.out.println("Perform With Group of Trainees");
    }

    public PerformWithGroup() {
    }

}
