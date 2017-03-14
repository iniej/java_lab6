package com.Iniebiyo;

        import java.util.ArrayList;

/**
 * Created by Iniebiyo  on 3/10/2017.
 */
public class ITECCourseManager1 {
    public static void main(String args[]) {

        //Create a java Programming object.
        ITECCourse1 javaProgramming = new ITECCourse1("Java Programming",
                2545, 24, "None");

        //Add students.
        javaProgramming.addStudent("Gus");
        javaProgramming.addStudent("Harry");
        javaProgramming.addStudent("Izzy");



        System.out.println(" ");

        //Create an info Tech Concepts object.
        ITECCourse1 infoTecConcepts = new ITECCourse1("Info Tech Concepts", 1100,
                30, "T3050");
        // Add students.
        infoTecConcepts.addStudent("Max");
        infoTecConcepts.addStudent("Nancy");
        infoTecConcepts.addStudent("Orson");


        //Add all the ITECCourses in courses.
        ArrayList<ITECCourse1> courses = new ArrayList<ITECCourse1>();
        courses.add(javaProgramming);
        courses.add(infoTecConcepts);

        //Print out all the courses information.
        System.out.println(String.format("%-25s %-25s", "Course Name", "Free Space"));
        System.out.println("-------------------------------------");
        for (ITECCourse1 Itec : courses) {
            System.out.println(Itec);

        }

    }


}
