//converting one data type to another is called type conversion we has 2 types in it implict and explict convertion

public class Typecasting {
    public static void main(String args[]){
        //Widing/Implict conversion
        //converting small type to large like byte=>short=>int=>long,float=>double but we can convert char to boolean
        int a=678;
        double b=a;
        System.out.println(b);

        //Narrowing/Explicit Casting
        //converting large type to small like double=>float in this case we ca loose thw data

        double db=56.98;
        int x=(int) db;
        System.out.println(x);

        int by=245;
        byte bi=(byte) by;
        System.out.println(bi);//here the conpect work is that it will take last 8 binary bits of 245 and return the output
        

        //automatic casting by java 
        byte c=123;
        byte d=7;
        int result= c*d;
        System.out.println(result);//here java automatically convert byte data type to int 
    }
}
//output
// PS C:\REWORK\Java> java Typecasting.java
// 678.0
// 56
// -11
// 861
