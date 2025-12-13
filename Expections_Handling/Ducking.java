class A{
    void show() throws ClassNotFoundException{
        Class.forName("XYZ");
    }
}




public class Ducking {
    // Ducking Exception use throws keyword 
    public static void main(String[] args) {
        A obj = new A();
        try{
        obj.show(); // here we are calling the show but it has an error so we use to solve that
        }
        catch(ClassNotFoundException e){
            System.out.println("Exception handled "+ e);
        } 
    }
}
