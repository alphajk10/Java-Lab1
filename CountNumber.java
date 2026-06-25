public class CountNumber {
    public static void main(String[] args) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int[] arr = {5, -3, 0, 8, -1, 4};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                positive++;
            }
            if (arr[i] > 0) {
                negative++;
            }
            if (arr[i] == 0) {
                zero++;
            }
        }
        System.out.println("Positive Number : " + positive);
        System.out.println("Negative Number : " + negative);
        System.out.println("Zeros : " + zero);
    }
}
