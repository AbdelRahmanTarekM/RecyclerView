package com.compass.abdelrahmantarek.recyclerview;

//Our Model Class
public class Student {

    String name;
    String year;
    String id;
    String department;

    public Student(String name, String year, String id, String department) {
        this.name = name;
        this.year = year;
        this.id = id;
        this.department = department;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
