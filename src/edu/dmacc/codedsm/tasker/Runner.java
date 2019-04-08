package edu.dmacc.codedsm.tasker;

import edu.dmacc.codedsm.tasker.objects.User;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Starting runner...");
        User me = new User("Rachel", "O", "Email");
        me.assignInPerson();
        me.assignOverEmail();
        me.assignOverPhone();
    }

}
