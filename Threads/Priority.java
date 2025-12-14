class A extends Thread{
    public void run(){
        for (int i=1;i<=50;i++){
            System.out.println("Hello");    
    }
}
}
class B extends Thread{
     public void run(){
        for (int i=1;i<=50;i++){
            System.out.println("Bala");
    }
}
}

public class Priority {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();       
        System.out.println(obj.getPriority());  // getpriority() is used to get the priority of thread the default priority is 5 and it range from 1 to 10 the 1 is lowest one and 10 is highest one
        obj1.setPriority(9);// we can set the priority by using setpriority() method
        System.out.println(obj1.getPriority());

        // we can also set the priority of thread by using predefined constant  
        obj.setPriority(Thread.MIN_PRIORITY); // 1
        obj1.setPriority(Thread.MAX_PRIORITY); // 10
        obj.start();
        obj1.start();
    }
}
