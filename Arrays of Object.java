class Student{//step 1 create a class and declare some values
    int id;
    String name;
    String Dept;
}

public class Arrayofobj {
    public static void main(String[] args) {
        Student obj =new Student();
        obj.id=101;//create a object and push values into that object
        obj.name="Ram";
        obj.Dept="CSE";
         Student obj2 =new Student();
        obj2.id=102;
        obj2.name="Rinku";
        obj2.Dept="AI";
        System.out.println("Id of student 1:"+obj.name);
        System.out.println("Name of student 2:"+obj2.name);
        System.out.println("-------------------------------------------------");
        System.out.println("Now initializing object into array");
        Student arr[]= new Student[2];//here 2 is no.of objects   //step3 now create array to object 
        arr[0]=obj;//step 4 now assign object to array
        arr[1]=obj2;
        for(int i=0;i<arr.length;i++){//step 5 print the values
            System.out.println("Id of student:"+arr[i].id+" Name of student:"+arr[i].name+" Department of Student:"+arr[i].Dept);
        }
    }
}
// output
// PS C:\REWORK\Java\arrays> javac Arrayofobj.java
// PS C:\REWORK\Java\arrays> java Arrayofobj
// Id of student 1:Ram
// Name of student 2:Rinku
// -------------------------------------------------
// Now initializing object into array
// Id of student:101 Name of student:Ram Department of Student:CSE
// Id of student:102 Name of student:Rinku Department of Student:AI
