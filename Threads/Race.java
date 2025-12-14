class Counter {
    int count;

     synchronized void increment() {  // we use synchronized keyword to make this method thread-safe and allow a single thread to access it at a time
        count++;   
    }

    /*  void increment(){
        synchronized(this) {  // we can also use synchronized block to achieve the same effect
            count++;
        }
    }
     */
}

public class Race
 {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();  // join() method is used to wait for threads to finish their execution
        t2.join();

        System.out.println(c.count);
    }
}
