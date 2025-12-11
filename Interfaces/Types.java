// Normal Interface
interface A{
    void show();
    void display();
    void show1();    // normal interface has 2 or more methods is called normal interfaces 
}

@FunctionalInterface  // after using this annotation we try to create the another method is throws the error 
interface B {  // we can also can't extends another interface in functional interface
    void show();  // functional interface has only one abstract method  
}

//Marker Interface
interface C{
    // it does not contain any method is called marker interface 
}



public class Types {
    public static void main(String[] args) {
        A obj = new A(){  // this is anonymous class means we did not create any class the implement the interface just you this object inside  and method 
            public void show(){
                System.out.println("show method implementation");
            }
            public void display(){
                System.out.println("display method implementation");
            }

            public void show1(){
                System.out.println("show1 method implementation");
            }

        };
        obj.show();
        obj.display();
        obj.show1();
        B obj1 = new B(){
            public void show(){  // we need to must give public else it throws error
                System.out.println("functional interface show method implementation");

        } ;
    };    obj1.show();

    }


    
}
