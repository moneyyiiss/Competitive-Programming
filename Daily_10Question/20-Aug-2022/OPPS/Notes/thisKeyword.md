this keyword
    Refer current invoking object.
    this() -> for calling current class constructor from inside different constructor of same class.

    Class Test{
        public void show(){
            ye this refer karega t2 object ko
            this means t2 because show() is running on t2 object 
            agar method show() t1 par chalega to this t1 ko refer karega
            This.a

            //simply mtlb current object ke variable ko access kr skte hai with the help of this keyword
        }
    }

    Test t = new Test()
        t.show()

    Test t2 = new Test()
        t2.show()