package OPPS.Overriding;

public class Parent {
    //overridden method
    //eshki body change ho rahi hai to ese overridden method bolte hai
    public void m1(){
        System.out.println("i am m1() of parent");
    }
}

class Child extends Parent{
    //overriding method
    // ye parent ka body change kr raha hai to esko overridding method kehte hai
    //Co-varient return types are allow
    public void m1()
    {
        System.out.println("i am m1 of child ");
    }
}
