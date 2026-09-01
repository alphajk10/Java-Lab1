import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {9,3,7,1,5};

        Arrays.sort(arr);

        for(int x : arr)
            System.out.print(x + " ");
    }
}