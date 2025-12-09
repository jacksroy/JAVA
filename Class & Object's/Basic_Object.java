class Demo{
    int a,b,result;
  void de(){
    // a=4;
    // b=9;
    result=a+b;
    
      System.out.println("Result :" +result);
  }  
}
public class Basic_Object{
    public static void main(String[] args){
        Demo obj=new Demo();
        obj.a=10;
        obj.b=29;
        obj.de();
    }
}