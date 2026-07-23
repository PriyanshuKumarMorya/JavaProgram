package JavaClassProblem;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Dog{
    void sound() {
        System.out.println("Cat meows");
    }}
public class Priyanshu5 {
    public static void main(String[] args) {
// Creating objects of different classes
        Animal animal1 = new Animal();
        Animal animal2 = new Dog(); //
        Animal animal3 = new Cat();

        animal1.sound();
        animal2.sound();
        animal3.sound();
    }
}
