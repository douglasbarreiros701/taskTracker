package org.taskTracker;

public class Switch {

    Listen listen = new Listen();
    TaskManager taskManager = new TaskManager();

    public void options(){
    try {
        String listened = listen.listenning();

        switch (listened){
            case "1":
                Listen listenTaskCase = new Listen();
                String listennedTask = listenTaskCase.listenning();
                Task task = new Task(listennedTask);
                taskManager.createTask(task);
                System.out.println("executando switch");
        }

    } catch (Exception e){
        System.out.println("Deu erro no switch: " +e);
    }



    }


}
