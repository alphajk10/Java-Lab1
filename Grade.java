import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int m = new Scanner(System.in).nextInt();

        if(m>=90) System.out.println("Grade = A");
        else if(m>=80) System.out.println("Grade = B");
        else if(m>=70) System.out.println("Grade = C");
        else System.out.println("Grade = D");
    }
}