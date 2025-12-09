class Root{
    public int add(int a,int b){
        return a+b;
    }
}
class Sub extends Root{
    public int sub(int a,int b){
        return a-b;
    }

}

class Leaf extends Sub{
    public int mul(int a,int b){
        return a*b;
    }

}

public class Multi_level {
    public static void main(String[] args) {
        Leaf obj =new Leaf();
        System.out.println("Sum :"+obj.add(12,3));
        System.out.println("Sub :"+obj.sub(5,3));
        System.out.println("Mul :"+obj.mul(4,3));
    }
    
}
