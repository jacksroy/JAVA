class A{
    int num=6;
    double dou=9.7;
    float flo= 89.7f;

}

class B extends A{ //class B extends class A here it is single -level Inheritance
    void show(){
        int num=89;
        double dou = 8744.9;
        System.out.println("Calling Class B");
        System.out.println("Number is : "+num);//here we has num variable in both B and A class but it takes value from class B but i need to take value from class A it is super class of class B

        System.out.println("It takes double value from its Super class :"+super.dou);
        System.out.println("Every class in java by default extends the Object Class ");

    }
}


public class SuperVariable {
    public static void main(String[] args) {

        B obj= new B();
        obj.show();
        
    }
}


//output
// PS C:\REWORK\Java\Super> javac SuperVariable.java
// PS C:\REWORK\Java\Super> java SuperVariable
// Calling Class B
// Number is : 89
// It takes double value from its Super class :9.7
// Every class in java by default extends the Object Class 
