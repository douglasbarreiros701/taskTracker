package org.taskTracker;

import java.time.LocalDate;
import java.util.UUID;

public class TaskManager {

    private UUID id;
    private String description;
    private TaskStatus status;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public TaskManager(String description, TaskStatus status, LocalDate createdAt, LocalDate updatedAt){
        this.id = UUID.randomUUID();
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;

    }







}
