class Base {
    private int i;

    // Method to set the value of i
    public void seti(int a) {
        i = a;
        System.out.println("Value of i is set to " + i);
    }

    // Method to return the value of i
    public int geti() {
        System.out.println("The current value of i is " + i + " and it is returned.");
        return i;
    }
}

// Derived class inherits Base class
class Derived extends Base {
    private int j;

    // Method to set the value of j
    public void setj(int a) {
        j = a;
        System.out.println("Value of j is set to " + j);
    }

    // Method to return the value of j
    public int getj() {
        System.out.println("The current value of j is " + j + " and it is returned.");
        return j;
    }
}

public class Inherit {

    public static void main(String[] args) {

        // Working with Base class object
        System.out.println("\nWorking with Base class object");

        Base objB = new Base();

        objB.seti(10);

        System.out.println(
                "The current value of i received in main is -> "
                        + objB.geti()
        );


        // Working with Derived class object
        // using inherited Base class methods
        System.out.println("\nWorking with Derived class object");

        Derived objD = new Derived();

        // seti() and geti() are inherited from Base
        objD.seti(20);

        System.out.println(
                "The current value of i received in main is -> "
                        + objD.geti()
        );


        // Working with Derived class methods
        objD.setj(30);

        int k = objD.getj();

        System.out.println(
                "The current value of j received in main is -> "
                        + k
        );
    }
}