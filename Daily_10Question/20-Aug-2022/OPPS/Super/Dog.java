package OPPS.Super;

public class Dog extends Animal{
    public Dog(){
        //child class ke constructor ke andr se parent class ke constructor ko call kr rahe hai
        //this must be the first line
        super();
        // super(12);
    }
    int x = 4;
    public void speak(){
        //super keyword refer immediate parent 
        System.out.println(super.x); // parent ki property ko access krne ke liye super use karenge
        System.out.println(this.x); // apne class ka print krne ke liye this
    }
}


