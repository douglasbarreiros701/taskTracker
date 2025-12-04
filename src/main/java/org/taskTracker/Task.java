package org.taskTracker;

import java.time.LocalDate;
import java.util.UUID;

public class Task {

    private UUID id;
    private String description;
    private TaskStatus status;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    Listen listen = new Listen(); //Escutando o que foi colocado no prompt

    public Task(String description){
        this.id = UUID.randomUUID();
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;

        System.out.println("Id sendo gerado: " + id);

    }



}
