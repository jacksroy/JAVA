class Demo{
    int a,b,result;
  int de(){
    // a=4;
    // b=9;
    result=a+b;
    
      System.out.println("Result :" +result);
    // return n1+n2;
  }  
}
public class Object{ //file name should be save with main class here Object is main class
    public static void main(String[] args){
        Demo obj=new Demo();// object creted with name with obj
        obj.a=10;
        obj.b=29;
        obj.de();//method call by object name obj
    }
}
