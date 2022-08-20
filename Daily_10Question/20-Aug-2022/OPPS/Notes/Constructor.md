Constructor: constructor is for storing object's data or initialize the object.
Constructor is used to initialize the data of the object
Automatically when we create constructor

Rule:
1. Name == Class Name
2. Constructor does not return any value. Not even void
//this is Non-parameterized
public Student(){

}

//this is parameterize Constructor
Public Student(int a, int b, String str){

}

when Java create automatically-default constructor
If class does not have any constructor then java creates one default constructor;
public Student(){
    
}