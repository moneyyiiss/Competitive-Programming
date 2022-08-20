package OPPS.Constructor_Overloading;

public class Student {
    //data: data members: instance variable
    int studentId;
    String studentName;
    String studentCity;


    //Here happend constructor overloading

    public Student(){
        System.out.println("creating object : Non-perametrized");
    }
    // this is formal parameter written in Student() i.e. int st
    public Student(int st){
        System.out.println("parametrized constructor: (int) argument");
    }

    public Student(int i, String n, String c){
        studentId = i;
        studentName = n;
        studentCity = c;
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
