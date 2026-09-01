class Animal {

    void eat() {
        System.out.println("Animal is eating.");
    }
}
class Dog extends Animal {

    void eat() {

        System.out.println("Dog is eating.");

        super.eat();
    }
}
public class Test {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
    }
}
