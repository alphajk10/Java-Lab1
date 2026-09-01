import java.util.Scanner;
public class Integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = input.nextInt();
        int sum = 0;
        int count =0;
        int sum1 = 0;
        System.out.print("Numbers : ");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) {
                sum += i;
            }
            if(i%2!=0){
                count++;
            }
            if(i%5==0){
                sum1 = i;
            }
        }
        System.out.println(" ");
        System.out.println("Sum of Even Numbers : " +sum);
        System.out.println("Odd Count : " +count);
        System.out.println("Largest Multiple of 5 : " +sum1);
    }
}