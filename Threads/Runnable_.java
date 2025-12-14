class A implements Runnable{
    public void run(){
        for (int i=1;i<=50;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10); // this take input in milliseconds
                // sleep method is used to pause the execution of current thread for specified time

            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
        }
    }

}
class B implements Runnable{
    public void run(){
        for (int i=1;i<=50;i++){
            System.out.println("Bala");
            try {
                Thread.sleep(10); // this take input in milliseconds
                //sleep method is a static method of Thread class which is used to pause the execution of current thread for specified time
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
        }
    }

}


public class Runnable_ {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start(); // here why we create the thread object because start() is the method of Thread class not of Runnable interface 
        try {
                Thread.sleep(2); // this take input in milliseconds
                //sleep method is a static method of Thread class which is used to pause the execution of current thread for specified time
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
        
        t2.start();
    }
}




