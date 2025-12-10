class Outer{
    void show(){
        System.out.println("Outer class");
    }
    
    
}


public class Anonymous_Class {
    public static void main(String[] args) {
        Outer obj = new Outer(){
            void show(){
                System.out.println("Anonymous Inner class");
            }
        };
        obj.show();
    }

    
}
