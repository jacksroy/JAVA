public class Operators {
    public static void main(String args[]){
        //Arithmetic operators
        int a=10;
        int b=20;
        int result=a+b;//add 2 or more number or 2 or more variables
        System.out.println("Adding of 2 numbers:"+result);
        //subtraction of numbers
        int result1=a-b;
        System.out.println("Subtraction of 2 numbers:"+result1);
        //Multiplication
        int result2=a*b;
        System.out.println("Multiplication of 2 numbers:"+result2);
        //Division
        int result3=a/b;//here division give the Quotient value as output
        System.out.println("Div Quotient of 2 numbers:"+result3);
        //Modules
        int result4=a%b;
        System.out.println("Modules Remainder of 2 numbers:"+result4);
        System.out.println("---------------------------------------------------");
        System.out.println("Relational Operator");

        //Relational operator (>,<,>=,<=,==,!=)
        int maths=95;
        int science=30;
        int social=80;
        boolean passOrNot=maths>=35;
        boolean passOrNot1=science>=35;
        boolean passOrNot2=social>=35;//check greater than and equal too
        System.out.println("Pass in Maths:"+passOrNot);
        System.out.println("Pass in Science:"+passOrNot1);
        System.out.println("Pass in Social:"+passOrNot2);
        boolean full= maths==100;//check equal or not
        boolean full1= science==100;
        boolean full2= social==100;
        System.out.println("Full marks in Maths:"+full);
        System.out.println("Full marks in Science:"+full1);
        System.out.println("Full marks in Social:"+full2);
        int totalMarks =maths + science + social;//total add using arithmetic Operator
        System.out.println("Total Marks:"+totalMarks);
        boolean total= totalMarks>=250;
        System.out.println("Total Marks Greater Than 250:"+total);
        int average = totalMarks/3;//division
        System.out.println("Average Value:"+average);
        boolean avg=average<=40;//less than and equal too
        System.out.println("Average Value is less than 40:"+avg);
        System.out.println("---------------------------------------------------");
        System.out.println("Logical Operator");

        //logical operator
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
        double initialBalance=5000;
        int deposit=2000;
        int withDraw=1500;
        double interest=5;
        int bankCharge=300;
        
        System.out.println("Initial Balance is:"+initialBalance);
        System.out.println("Deposit Amount:"+deposit);
        System.out.println("WithDraw Amount:"+withDraw);
        System.out.println("Interest Percentage:"+interest+" %");
        System.out.println("BankCharges Amount:"+bankCharge);
        initialBalance+=deposit;
        System.out.println("After Deposit:"+initialBalance);
        initialBalance-=withDraw;
        System.out.println("After WithDraw:"+initialBalance);
        initialBalance*=(1+interest/100);
        System.out.println("After Interest:"+initialBalance);
        initialBalance-=bankCharge;
        System.out.println("After Bank Charges:"+initialBalance);
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
