import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basic = sc.nextDouble();

        double da = basic * 0.10;
        double hra = basic * 0.15;
        double gross = basic + da + hra;

        System.out.println("DA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("Gross Salary = " + gross);
    }
}