package OPPS.Class_Object_Constructor;

public class Demo {
    public static void main(String[] args) {
        Student st1;
        st1 = new Student();
        //whenever we create object of class then by default it will create constructor in Student.java class
    

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
