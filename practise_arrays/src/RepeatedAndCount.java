import java.util.Scanner;

public class RepeatedAndCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean[] visited = new boolean[n]; // track visited elements

        System.out.println("Element : Count");
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue; // skip if already counted

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count > 1) {
                System.out.println(arr[i] + " : " + count);
            }
        }
    }
}
