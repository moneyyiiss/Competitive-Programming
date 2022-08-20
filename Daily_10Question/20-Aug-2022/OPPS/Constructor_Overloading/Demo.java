package OPPS.Constructor_Overloading;

public class Demo {
    public static void main(String[] args) {
        Student st1;
        st1 = new Student();
    //this is constructor Student() whose have no argument
        //whenever we create object of class then by default it will create constructor in Student.java class
    
        st1.studentName = "Ram";
        st1.studentId = 123;
        st1.studentCity = "DELHI";

        st1.study();
        st1.showFullDetails();

        //creating 2nd object
        //this is actual parameter written in Student() i.e. 12
        Student st2 = new Student(12);
        st2.studentId = 741;
        st2.studentName = "SHYAM";
        st2.studentCity = "MUMBAI";

        st2.study();
        st2.showFullDetails();

        Student st3 = new Student(23, "Manish", "Mohali");
        st3.study();
        st3.showFullDetails();
    }
}
