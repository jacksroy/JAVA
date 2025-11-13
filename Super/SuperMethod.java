class Animal{
    void it(){
        System.out.println("it is Super class method");
    }
}

class Bird extends Animal{
    void it(){
        System.out.println("it is sub class method");
    }

    void show(){
        super.it();  // it call super class method
        it();  //it call sub class Method 
    }
}


public class SuperMethod {
    public static void main(String[] args) {
        Bird obj =new Bird();
        obj.show();
    }
}


//output
// PS C:\REWORK\Java\Super> javac SuperMethod.java
// PS C:\REWORK\Java\Super> java SuperMethod      
// it is Super class method
// it is sub class method
