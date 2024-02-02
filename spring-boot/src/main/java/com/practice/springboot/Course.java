package com.practice.springboot;

public class Course {
    int id;
    String courseName;
    String student;

    public Course(int id,String courseName, String student){
        this.id=id;
        this.courseName=courseName;
        this.student=student;
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getStudent() {
        return student;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", student='" + student + '\'' +
                '}';
    }
}
