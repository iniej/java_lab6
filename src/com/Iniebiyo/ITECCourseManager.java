package com.Iniebiyo;

/**
 * Created by Iniebiyo  on 3/1/2017.
 */
public class ITECCourseManager {

    public static void main(String args[]) {
        ITECCourse1 javaProgramming = new ITECCourse1("Java Programming",
                2545, 24, "None");

        //Add students.
        javaProgramming.addStudent("Gus");
        javaProgramming.addStudent("Harry");
        javaProgramming.addStudent("Izzy");

        //Call the writeCourseInfo method and number of
        // students  for
        // the Java programming class.
        javaProgramming.writeCourseInfo();
        javaProgramming.getNumberOfStudents();

        System.out.println(" ");

        ITECCourse infoTecConcept = new ITECCourse("Info Tech Concepts", 1100,
                30, "T3050");
        // Add students.
        infoTecConcept.addStudent("Max");
        infoTecConcept.addStudent("Nancy");
        infoTecConcept.addStudent("Orson");

        //Call the writeCourseInfo method, and number of
        // students  for
        // the Info Tech Concepts class.
        infoTecConcept.writeCourseInfo();
        infoTecConcept.getNumberOfStudents();
    }

}
