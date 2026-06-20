import java.util.*;

public class maximumadditonofsubarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of elem");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elem");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("your array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int currectSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if ((currectSum + arr[i]) > arr[i]) {
currectSum+=arr[i];

            }else{
                currectSum = arr[i];
            }
if (currectSum>maxSum){
    maxSum = currectSum;
}

        }
        System.out.println(maxSum);
    }


}