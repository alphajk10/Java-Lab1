public class Largest3 {
    public static void main(String[] args) {
        int a=25,b=40,c=15;

        if(a>b && a>c) System.out.println("Largest = " + a);
        else if(b>c) System.out.println("Largest = " + b);
        else System.out.println("Largest = " + c);
    }
}