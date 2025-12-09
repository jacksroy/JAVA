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
