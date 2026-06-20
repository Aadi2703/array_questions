public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int start = 1;
        int end = 4;

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of subarray = " + sum);
    }
}

