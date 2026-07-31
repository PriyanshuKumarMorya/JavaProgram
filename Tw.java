package Zz;

//// Interface 1
//interface Animal {
//    void eat();
//    void sleep();
//}
//
//// Interface 2
//interface Pet {
//    void play();
//    void beFriendly();
//}
//
//// Concrete class implementing both interfaces
//class Dog implements Animal, Pet {
//    // Implementing methods from Animal interface
//    public void eat() {
//        System.out.println("Dog is eating.");
//    }
//
//    public void sleep() {
//        System.out.println("Dog is sleeping.");
//    }
//
//    // Implementing methods from Pet interface
//    public void play() {
//        System.out.println("Dog is playing.");
//    }
//
//    public void beFriendly() {
//        System.out.println("Dog is being friendly.");
//    }
//}
//
//public class Tw {
//    public static void main(String[] args) {
//        // Creating an object of Dog class which implements both Animal and Pet interfaces
//        Dog dog = new Dog();
//
//        // Calling methods from both interfaces
//        dog.eat();
//        dog.sleep();
//        dog.play();
//        dog.beFriendly();
//    }
//}

//Exercise 2.2
// Step 1: Define Interface A with a default method
interface A {
    // Default method
    default void defaultMethod() {
        System.out.println("This is the default method from Interface A.");
    }
}

// Step 2: Define Interface B with an abstract method display
interface B {
    // Abstract method
    void display();
}

// Step 3: Create class MultipleInheritance that implements both interfaces
class MultipleInheritance implements A, B {
    // Step 4: Implement the abstract method display from interface B
    @Override
    public void display() {
        System.out.println("Display method from Interface B implemented in MultipleInheritance class.");
    }

    // Step 4: Override the default method from interface A (optional)
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method from Interface A in MultipleInheritance class.");
    }
}

public class Tw {
    public static void main(String[] args) {
        // Create an object of MultipleInheritance
        MultipleInheritance obj = new MultipleInheritance();

        // Calling the display method from interface B
        obj.display();

        // Calling the defaultMethod which is overridden in the MultipleInheritance class
        obj.defaultMethod();
    }
}







