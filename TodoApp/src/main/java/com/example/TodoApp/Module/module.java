package com.example.TodoApp.Module;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class module {
    @Id
   private int id;
   private String name;
   private boolean completed;

    public module() {

    }

    public module(int id, String name, boolean completed) {
        this.id = id;
        this.name = name;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
