class Methods{
    String name;
    int age;
    public static void show(Methods obj){ //class name and reference variable need to crete her 
        System.out.println("This is Static Method and call byt call name");//static methods need to static variables so we need to in-directly link 
        System.out.println(obj.name+":"+obj.age+": "); //we need to call instance variable by reference variable
    }
}

public class Static_Methods {
    public static void main(String[] args) {
        Methods obj2 =new Methods();
        obj2.name="Java";
        obj2.age=23;
        Methods obj1 =new Methods();
        obj1.name="JSP";
        obj1.age=27;
        Methods.show(obj2);//tell which obj we are calling
    }
    
}
