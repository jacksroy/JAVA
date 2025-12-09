class Wrapper{
    public static void main(String args[]){
        int num= 8;   //primitive data type
        System.out.println("Primitive way: "+num);

        // Integer  num1= new Integer(9);  //this  is not preferred way 

        Integer num1 =89;   //wrapper class
        System.out.println("Wrapper Class : "+num1);

        Double dou =3.6;
        System.out.println("Wrapper Double : "+dou);


        //auto-Boxing 
        //converting primitive to Wrapper 

        Integer numInteger =num;
        System.out.println("Primitive to Wrapper Integer :"+numInteger);

        Double double1=(double) num;  // converted int top double 

        System.out.println("Primitive to Wrapper Double : "+ double1);



        // unboxing 
        //Wrapper to Primitive 
        int num3 = num1;

        System.out.println("Wrapper to Primitive :"+ num3);


        //String to int 

        String str = "90";
        Integer number = Integer.parseInt(str);

        System.out.println("String to Integer : "+ number);

    }
}



//output
// PS C:\REWORK\Java\Wrapper Classes> javac Wrapper.java
// PS C:\REWORK\Java\Wrapper Classes> java Wrapper
// Primitive way: 8
// Wrapper Class : 89
// Wrapper Double : 3.6
// Primitive to Wrapper Integer :8
// Primitive to Wrapper Double : 8.0
// Wrapper to Primitive :89
// String to Integer : 90
