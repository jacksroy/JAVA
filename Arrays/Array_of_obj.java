class Student{//step 1 create a class and declare some values
    public Student(int i, String string, int j) {
        //TODO Auto-generated constructor stub
    }
    int id;
    String name;
    String Dept;
    public int marks;
}

public class Array_of_obj {
    public static void main(String[] args) {
        Student obj =new Student();
        obj.id=101;//create a object and push values into that object
        obj.name="Ram";
        obj.Dept="CSE";
         Student obj2 =new Student();
        obj2.id=102;
        obj2.name="Ring";
        obj2.Dept="AI";
        System.out.println("Id of student 1:"+obj.name);
        System.out.println("Name of student 2:"+obj2.name);
        System.out.println("-------------------------------------------------");
        System.out.println("Now initializing object into array");
        Student arr[]= new Student[2];//here 2 is no.of objects   //step3 now create array to object 
        arr[0]=obj;//step 4 now assign object to array
        arr[1]=obj2;
        System.out.println("Printing array using for loop");
        for(int i=0;i<arr.length;i++){//step 5 print the values
            System.out.println("Id of student:"+arr[i].id+" Name of student:"+arr[i].name+" Department of Student:"+arr[i].Dept);
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Printing array using for each loop");
        for(Student i:arr){
             System.out.println("Id of student:"+i.id+" Name of student:"+i.name+" Department of Student:"+i.Dept);
        }
    }
}
