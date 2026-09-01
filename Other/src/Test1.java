// Superclass
class Animall {

    // Constructor of Animal class
    Animall() {
        System.out.println("Animal Constructor");
    }
}

// Subclass
class Dogg extends Animall {

    // Constructor of Dog class
    Dogg() {
        // Calls the constructor of Animal class
        super();

        System.out.println("Dog Constructor");
    }
}

// Main class
public class Test1 {

    public static void main(String[] args) {

        // Creating an object of Dog class
        Dogg d = new Dogg();

    }
}