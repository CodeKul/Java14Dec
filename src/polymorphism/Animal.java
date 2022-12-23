package polymorphism;

/**
 * method overriding - two class have same method with same signature is called method overriding
 * <p>
 * runtime polymorphism, late binding, dynamic polymorphism
 */
public class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.sound();
    }

    public void sound() { //concrete
        System.out.println("in cat sound");
    }
}

class Dog extends Animal {

    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
    }

}