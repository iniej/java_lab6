package com.Iniebiyo;

import java.util.ArrayList;

/**
 * Created by Iniebiyo  on 3/6/2017.
 */
public class ITECCourse {

    /**
     * Store data about ITEC Course.
     */
    //Data that an ITEC object needs to store.
    private String name;
    private int code;
    private ArrayList<String> students;
    private int maxStudents;
    private String room;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    //Constructor is used to set up and initialize the object.
    public ITECCourse(String courseName, int courseCode,
                      int courseMaxStudents, String courseRoom) {

        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>(); //Set up the students list.
        this.maxStudents = courseMaxStudents;
        this.room = courseRoom;
        ArrayList<ITECCourse>courses = new ArrayList<ITECCourse>();

    }

    void addStudent(String studentName) {
        //No need to create arrayList, the constructor has already done it.

        //Check to see if the course is full before adding a student.
        if (students.size() == maxStudents) {
            System.out.println("Course is full - can't add " + studentName);
        } else {
            students.add(studentName);
        }

    }
    //Create the remove student method.
    void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            //Check to see if the student name is in the list before removing it.
            students.remove(studentName);
            System.out.println(studentName + "was un-enrolled from " + this.name);
        } else {
            System.out.println(studentName + "was not found in " + this.name);
        }
    }
    //Create the write course information method.
    void writeCourseInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Course Room: " + room);
        System.out.println("Student enrolled:");
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students for this class is " + maxStudents);
    }

    int getNumberOfStudents() {

        return this.students.size();
    }


}



