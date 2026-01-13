package com.project2.controller;

public class Task {
    int id;
    String title;
    String deadline;
    String status;

    public Task() {}

    public Task(int id, String title, String deadline, String status){
        this.id = id;
        this.title = title;
        this.deadline = deadline;
        this.status = status;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDeadline() { return deadline; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
