class Ab{
    int age;
    String name;
    public Ab(){
        System.out.println("Default Constructor");
    }
    public Ab(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("Age:"+age+" "+ "Name:"+name);
        System.out.println("Parameterized Constructor");
    }
    
}
public class types {
    public static void main(String[] args) {
        Ab obj= new Ab();//default constructor is call and print the output
        Ab obj1 = new Ab(18,"Guru");//Parameterized constructor we assign values and now constructor is called here  
    }
}

//output
// PS C:\REWORK\Java\Constructors> javac types.java
// PS C:\REWORK\Java\Constructors> java types
// Default Constructor
// Age:18 Name:Guru
// Parameterized Constructor
