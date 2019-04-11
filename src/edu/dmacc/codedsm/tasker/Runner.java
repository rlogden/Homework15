package edu.dmacc.codedsm.tasker;

import edu.dmacc.codedsm.tasker.objects.Task;
import edu.dmacc.codedsm.tasker.objects.User;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        User myUser = new User("Rachel", "O", "Email");
        Task myTask = new Task("Homework", 1, myUser, myUser);
        List<User> myList = new ArrayList<>();
        myList.add(myUser);
        PerformInPerson a = new PerformInPerson();
        PerformAtOffice b = new PerformAtOffice();
        PerformWithGroup c = new PerformWithGroup();

        a.performTask(myTask, myUser);
        b.performTask(myTask, myUser);
        c.performTask(myTask, myList);
    }
}
