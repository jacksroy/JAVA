class Person {
    Person(String name) {
        System.out.println("Parent constructor called: " + name);
    }
}

class Std extends Person {
    Std(String name) {
        super(name); // must be first line in constructor
        System.out.println("Child constructor called: " + name);
    }
}

class SuperConstructor {
    public static void main(String[] args) {
        Std s = new Std("Rahul");
    }
}


// output
// PS C:\REWORK\Java\Super> javac SuperConstructor.java
// PS C:\REWORK\Java\Super> java SuperConstructor
// Parent constructor called: Rahul
// Child constructor called: Rahul
