class Block{
    String name;
    int age;
    void show(){
        System.out.println("Name: "+name+" Age: "+age);
    }
     static{
        // this is static block call only once in the program 
        System.out.println("This is static Block");
    }
}

public class Static_Block {
    public static void main(String[] args) throws ClassNotFoundException {
        // Block obj =new Block();
        // obj.name="Vijayamma";
        // obj.age=39;

        // obj.show();
        Class.forName("Block");// we need to create object or constructor to call static block or the alternative way is this by calling by Class.forName("Class_Name")
        
    }
}
