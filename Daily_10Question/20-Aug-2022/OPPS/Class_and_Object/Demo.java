package OPPS.Class_and_Object;
/*
 * New keyword is a keyword through which we allocated dynamic memory
 */

public class Demo {
    public static void main(String[] args) {
        //now creating object of student
        Student st1;
// Note:- here this student is the type of class that we created in Student.java
// and here st1 is the variable
        st1 = new Student();
//Note:- here st1 is a container who will store the reference of object
        st1.studentName = "Ram";
        st1.studentId = 123;
        st1.studentCity = "DELHI";

        st1.study();
        st1.showFullDetails();

        //creating 2nd object
        Student st2 = new Student();
        st2.studentId = 741;
        st2.studentName = "SHYAM";
        st2.studentCity = "MUMBAI";

        st2.study();
        st2.showFullDetails();
    }
}
