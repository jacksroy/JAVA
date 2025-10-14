class Key{
    static String lang ="Java";//static variable will share data to all  
    String name;
    int age;

    void show(){
        System.out.println(name+ ": "+ lang + ": " +age+ ":");
    }
}

public class Static_variables {
    public static void main(String[] args) {
        
    Key obj =new Key();
    obj.name="will";
    obj.age=25;
    obj.show();
    Key obj1 =new Key();
    obj1.name="Jacks";
    obj1.age=26;
    obj1.show();
    Key.lang="JSP";// static variables are call by class name not by object name
    System.out.println("After changing the value of static variable");
    System.out.println("___________________________________________________________________");
    obj.show();
    obj1.show();
    
        
    }

    
}

// output
// PS C:\REWORK\Java\Static Keyword> javac Static_variables.java
// PS C:\REWORK\Java\Static Keyword> java Static_variables
// will: Java: 25:
// Jacks: Java: 26:
// After changing the value of static variable
// ___________________________________________________________________
// will: JSP: 25:
// Jacks: JSP: 26:
