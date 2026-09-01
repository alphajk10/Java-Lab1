//Lab 1, Topic 1, Question 1
//Date : 30/06/2026
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Course: ");
        String course = sc.nextLine();

        System.out.print("Percentage: ");
        double per = sc.nextDouble();

        System.out.println("\nStudent Details");
        System.out.println("---------------");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + roll);
        System.out.println("Course     : " + course);
        System.out.println("Percentage : " + per);
    }
}
