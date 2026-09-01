class A {
    A() {
        System.out.println("This is a Vehicle");
    }
}

class B extends A {
    B() {
        System.out.println("4 Wheeler Vehicles");
    }
}

class C extends B {
    C() {
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}

public class ClassA {
    public static void main(String[] args) {
        C obj = new C();
    }
}