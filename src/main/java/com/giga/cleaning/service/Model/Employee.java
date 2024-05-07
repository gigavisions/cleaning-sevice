package com.giga.cleaning.service.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cleaners")
public class Employee {
    private String name;
    private String _id;
    private int works_completed;
    private double total_score;
    private String availability;

    public Employee() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWorks_completed() {
        return works_completed;
    }

    public void setAge(int works_completed) {
        this.works_completed = works_completed;
    }

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        this._id = id;
    }

    public double getTotalScore() {
        return total_score;
    }

    public void setTotalScore(double totalScore) {
        this.total_score = totalScore;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", availability=" + availability +
                ", id=" + _id +
                ", totalScore=" + total_score +
                '}';
    }

}
