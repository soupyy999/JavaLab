
abstract class Animal {
    abstract void sound();
}


interface Run {
    void run();
}


class Dog extends Animal implements Run {

    void sound() {
        System.out.println("Dog barks");
    }

    public void run() {
        System.out.println("Dog runs");
    }
}

public class InheritanceExample {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.run();
    }
}
