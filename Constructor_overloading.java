class Student {
    int id;
    String name;
    int age;

    // Default constructor
    Student() {
        this(0, "Unknown", 18);  // calling another constructor using this()
    }

    // Parameterized constructor 1
    Student(int id, String name) {
        this(id, name, 18);  // default age
    }

    // Parameterized constructor 2
    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}

class Constructor_overloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(1, "Alice");
        Student s3 = new Student(2, "Bob", 22);

        s1.show();
        s2.show();
        s3.show();
    }
}
//output
// PS C:\REWORK\Java\Constructors> javac Constructor_overloading.java 
// PS C:\REWORK\Java\Constructors> java Constructor_overloading      
// ID: 0, Name: Unknown, Age: 18
// ID: 1, Name: Alice, Age: 18
// ID: 2, Name: Bob, Age: 22
