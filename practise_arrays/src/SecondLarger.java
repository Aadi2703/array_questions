import java.util.*;
public class SecondLarger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elemants");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elems");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("your array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int max1, max2;
        if (arr[0] >= arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max1 = arr[1];
            max2 = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }else{
                max2 = arr[i];
            }
        }


        System.out.println("\nfirst largest elemant is : " + max1);
        System.out.println("second largest elemant is : " + max2);

    }
}