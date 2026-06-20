import java.util.*;
public class sumofarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elmants of array");
        int n = sc.nextInt();
        int arr1[] = new int[n];
      int[] sum = new int[n];
        int arr2[] = new int[n];
        System.out.println("enter the number of 1st array");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("enter the number of 2nd array");
        for (int i = 0; i < n; i++) {
                arr2[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("sum of two array is : ");
                for (int i = 0; i < n; i++) {
                    sum[i] = arr1[i] + arr2[i];
                    System.out.print(sum[i]);
                }
            }
        }





