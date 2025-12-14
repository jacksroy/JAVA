class A extends Thread{
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
class B extends Thread{
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


public class Sleep {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();
        obj.start();
        try {
                Thread.sleep(2); // this take input in milliseconds
                //sleep method is a static method of Thread class which is used to pause the execution of current thread for specified time
            } catch (InterruptedException e) {
               
                e.printStackTrace();// this will print the exception details if any interruption occurs during sleep 
            }
        
        obj1.start();
    }
}
