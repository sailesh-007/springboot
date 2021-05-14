package org.example.springbooteg1.model;

public class Emp {

    public Emp(){

    }

    public Emp(int empId, int age, String name, String title) {
        this.empId = empId;
        this.age = age;
        this.name = name;
        this.title = title;
    }

    int empId;
    int age;
    String name;
    String title;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
