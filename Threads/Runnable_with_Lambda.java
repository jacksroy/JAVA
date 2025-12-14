public class Runnable_with_Lambda {
    public static void main(String[] args) {
        Runnable r1 = () ->  // we use lambda expression here to implement the run() method of Runnable interface
        {
            for(int i=1;i<=25;i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    
                    
                }
            }
        };
        Runnable r2 = () ->
        {
            for(int i=1;i<=25;i++){
                System.out.println("Bala");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    
                    
                }
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            
            
        }     t2.start();
    }
}
