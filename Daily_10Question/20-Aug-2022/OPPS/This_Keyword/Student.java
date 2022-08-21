package OPPS.This_Keyword;

public class Student {
    //data: data members: instance variable
    int studentId;
    String studentName;
    String studentCity;



    public Student(){
        //ek constructor se dusre constructor ko call kr skte hai depending upon argument
        this(96); // yaha par jaise hi Student() ye constructor call hoga
        //  waise hi this(96) ye Student(int st) ye constructor ko call kr dega.
        // this(96, "TEST", "CITY"); 
        System.out.println("creating object: non-p");
        System.out.println(studentCity);
        //ye hmlog studentCity use kiye h eska mtlb ush object ke studentCity
        //  ko use kiye hai jo esh wale constructor ko call krte time bn raha hoga.
        System.out.println(this.studentCity);
        //this mtlb wahi wala object jo create ho raha hoga ye wala constructor ko call krte time.
    }
    public Student(int st){
        System.out.println("parameterized Constructor: (int)");
    }
    // public Student(int i, String n, String c){
    //     //ye method me jo variable hai usko hmlog local variable kehte hai
    //     studentId = i;
    //     studentName = n;
    //     studentCity = c;
    // }

    // public Student(int i, String studentName, String studentCity){
    //     //ye method me jo variable hai usko hmlog local variable kehte hai
    //     studentId = i;
    //     studentName = studentName;
    //     studentCity = studentCity;
    //     //by chance agar dono variable ka name same ho jata hai to hmlog local variable se apna value object wale variable ko nahi pahucha payenge
    //     //to hmlog object wale variable ke saath this use karenge taki wo current object ko invoke kr sake .
    // }

    public Student(int i, String studentName, String studentCity){
        //ye method me jo variable hai usko hmlog local variable kehte hai
        studentId = i;
        this.studentName = studentName;
        this.studentCity = studentCity;

        //ye hamara current object ka variable hai
        //current object ke variable ko identify krne ke liye hmlog this use krte hai.
    }

    //Behaviour: member methods: methods: (fuctions)
    public void study(){
        System.out.println(studentName + " is studying");
        System.out.println(this.studentCity);
        //eska mtlb ush object ke studentCity ko use kr rahe ho jo object esh wale function ko call kr raha hoga
        // wo object jo esh wale method ko call kr raha hoga ush object ka reference eshme aa jayega
    }
   
    public void showFullDetails(){
        System.out.println("My name is" + studentName);
        System.out.println("My id is" + studentId);
        System.out.println("My city is" + studentCity);
    }
}
