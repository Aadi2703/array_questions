import java.util.*;
public class evenorodd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even =0;
        int odd =0;
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("your arry is" );
        for (int i =0;i<n;i++){
            System.out.print(arr[i]+ " ");

            if (arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }

        System.out.println("even " + even);
        System.out.println("odd " + odd);

    }
}
