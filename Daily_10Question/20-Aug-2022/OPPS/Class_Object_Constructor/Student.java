package OPPS.Class_Object_Constructor;

public class Student {
    //data: data members: instance variable
    int studentId;
    String studentName;
    String studentCity;

    //we created single constructor in this class
    //there 0 parameter
    public Student(){
        System.out.println("creating object");
    }

    //Behaviour: member methods: methods: (fuctions)
    public void study(){
        System.out.println(studentName + " is studying");
    }
    public void showFullDetails(){
        System.out.println("My name is" + studentName);
        System.out.println("My id is" + studentId);
        System.out.println("My city is" + studentCity);
    }
}
