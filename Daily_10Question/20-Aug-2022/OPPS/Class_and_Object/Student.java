package OPPS.Class_and_Object;

public class Student {
    //data: data members: instance variable
    int studentId;
    String studentName;
    String studentCity;

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
