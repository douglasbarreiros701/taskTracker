package org.taskTracker;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    List<Task> taskList = new ArrayList<>();

    public void createTask(String description){

        Task task = new Task(description);
        taskList.add(task);
        System.out.println("Task criada ");

    }








}
