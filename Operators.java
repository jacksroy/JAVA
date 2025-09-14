public class Operators {
    public static void main(String args[]){
        //Artimetic operators
        int a=10;
        int b=20;
        int result=a+b;//add 2 or more number or 2 or more varabiles
        System.out.println("Adding of 2 numbers:"+result);
        //subtraction of numbers
        int result1=a-b;
        System.out.println("Subtraction of 2 numbers:"+result1);
        //Multiplication
        int result2=a*b;
        System.out.println("Multiplication of 2 numbers:"+result2);
        //Division
        int result3=a/b;//here division give the Quotent value as output
        System.out.println("Div Quotent of 2 numbers:"+result3);
        //Modulurs
        int result4=a%b;
        System.out.println("Modules Remainder of 2 numbers:"+result4);
        System.out.println("---------------------------------------------------");
        System.out.println("Realational Operator");

        //Realational operator (>,<,>=,<=,==,!=)
        int maths=95;
        int science=30;
        int social=80;
        boolean passOrnot=maths>=35;
        boolean passOrnot1=science>=35;
        boolean passOrnot2=social>=35;//check greather than and equal too
        System.out.println("Pass in Maths:"+passOrnot);
        System.out.println("Pass in Science:"+passOrnot1);
        System.out.println("Pass in Social:"+passOrnot2);
        boolean full= maths==100;//check equal or not
        boolean full1= science==100;
        boolean full2= social==100;
        System.out.println("Full marks in Maths:"+full);
        System.out.println("Full marks in Science:"+full1);
        System.out.println("Full marks in Social:"+full2);
        int totalMarks =maths + science + social;//total add using arithemetic opertaor
        System.out.println("Total Marks:"+totalMarks);
        boolean total= totalMarks>=250;
        System.out.println("Total Marks Grather Than 250:"+total);
        int average = totalMarks/3;//divsion
        System.out.println("Average Value:"+average);
        boolean avg=average<=40;//less than and equal too
        System.out.println("Average Value is less than 40:"+avg);
        System.out.println("---------------------------------------------------");
        System.out.println("Logical Operator");

        //logical opertaor
        int age=25;
        boolean id=true;
        boolean stdid=false;
        boolean senid=false;
        boolean yes = age >18 && stdid==true;
        System.out.println("Not value :"+!yes);//here is output is true then not symbol give false if it is false then it return true
        
        System.out.println("Can Buy ticket:"+(age>=18 && id==true));
        System.out.println("Can Buy ticket as Student With Discount:"+(age<25 && stdid==true));
        System.out.println("Can Buy ticket as Senior With Discount:"+(age>=60 || senid==true));
        System.out.println("Not allowed to Book Ticket:"+(age<=18 && id==false));
        System.out.println("---------------------------------------------------");
        System.out.println("Assignment Operator");

        //Assignment Operator
        double intialBalance=5000;
        int deposit=2000;
        int withDraw=1500;
        double intrest=5;
        int bankCharage=300;
        
        System.out.println("Intial Balance is:"+intialBalance);
        System.out.println("Deposit Amount:"+deposit);
        System.out.println("WithDraw Amount:"+withDraw);
        System.out.println("Intrest Precentage:"+intrest+" %");
        System.out.println("BankCharages Amount:"+bankCharage);
        intialBalance+=deposit;
        System.out.println("After Deposit:"+intialBalance);
        intialBalance-=withDraw;
        System.out.println("After WithDraw:"+intialBalance);
        intialBalance*=(1+intrest/100);
        System.out.println("After Intrest:"+intialBalance);
        intialBalance-=bankCharage;
        System.out.println("After Bank Charages:"+intialBalance);
        System.out.println("---------------------------------------------------");
        System.out.println("Unary Operator");

        //unary Operators
        int a1 = 25;
        System.out.println("Starting Temp:"+a1);
        ++a1; 
        System.out.println("Morning :"+(++a1));
        a1++; 
        System.out.println("AfterNoon :"+(a1));
        --a1;
        --a1; 
        --a1; 
        System.out.println("Evening:"+a1); 
        a1--; 
        System.out.println("Night:"+a1);
        System.out.println("---------------------------------------------------");
        System.out.println("Ternary Operator");

        //Ternary Operator

        int maths1=90;
        int science1=70;
        int social1 =40;
        String pass=(maths1 >=80 && science1 >=80 && social1 >=80)? "Grade A":
        (maths1 >50 && science1 >=50 || social1 >=50)?"Grade B":
        "Grade C";
        System.out.println(pass);



  

    }
}
//output
// PS C:\REWORK\Java> javac Operators.java
// PS C:\REWORK\Java> java Operators
// Adding of 2 numbers:30
// Subtraction of 2 numbers:-10
// Multiplication of 2 numbers:200
// Div Quotent of 2 numbers:0
// Modules Remainder of 2 numbers:10
// ---------------------------------------------------
// Realational Operator
// Pass in Maths:true
// Pass in Science:false
// Pass in Social:true
// Full marks in Maths:false
// Full marks in Science:false
// Full marks in Social:false
// Total Marks:205
// Total Marks Grather Than 250:false
// Average Value:68
// Average Value is less than 40:false
// ---------------------------------------------------
// Logical Operator
// Not value :true
// Can Buy ticket:true
// Can Buy ticket as Student With Discount:false
// Can Buy ticket as Senior With Discount:false
// Not allowed to Book Ticket:false
// ---------------------------------------------------
// Assignment Operator
// Intial Balance is:5000.0
// Deposit Amount:2000
// WithDraw Amount:1500
// Intrest Precentage:5.0 %
// BankCharages Amount:300
// After Deposit:7000.0
// After WithDraw:5500.0
// After Intrest:5775.0
// After Bank Charages:5475.0
// ---------------------------------------------------
// Unary Operator
// Starting Temp:25
// Morning :27
// AfterNoon :28
// Evening:25
// Night:24
// ---------------------------------------------------
// Ternary Operator
// Grade B
