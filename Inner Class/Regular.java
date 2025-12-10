class Out{
    private int num =98;
    public void display(){
        System.out.println("outer Class");
    }
    class Inner{
        public void show(){
            System.out.println("Inner class");
            System.out.println("Number of private can also be accessed by the inner class:"+num);
        }
    }
}



public class Regular {
    public static void main(String[] args) {
        Out obj = new Out();
        obj. display();
        Out.Inner obj1 = obj.new Inner();
    obj1.show();       }
    
}
