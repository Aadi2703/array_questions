import java.util.*;

public class largest_elemant {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("enter the number of elem");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the elems");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("your array");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int largest =arr[0];
        for (int i=0;i<n;i++) {
            if (arr[i]>largest) {
                largest = arr[i];

            }
        }
        System.out.println("largest elem is" + largest);
    }
}
