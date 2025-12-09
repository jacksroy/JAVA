import java.util.Random;
class Randomm{
    public static void main(String[] args) {
        Random ran= new Random();
        int num= ran.nextInt(10)+1;//here 10 is limit or range and 1 is starting value 
        System.out.println(num);
    }
}