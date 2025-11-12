class Animal {
    void eat() {
        System.out.println("All animals eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

class Hierarchical {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}


//output
// PS C:\REWORK\Java\Inheritence> javac Hierarchical.java
// PS C:\REWORK\Java\Inheritence> java Hierarchical
// All animals eat
// Dog barks
// All animals eat
// Cat meows
