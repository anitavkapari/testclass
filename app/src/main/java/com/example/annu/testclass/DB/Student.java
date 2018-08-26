package com.example.annu.testclass.DB;

public class Student {

    public void setId(int id) {
        this.id = id;
    }


    private int id;
    private String name;
    private  String address;
    private  String phone;
    private  String course;
    private String branch;

    public Student(String name, String address, String phone, String course, String branch) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.course = course;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }


}


