import java.util.*;
public class SecondLarger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elemants");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the elems");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("your array");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int max1,max2,max3;
        if(arr[0]>=arr[1]&&arr[0]>=arr[2]) {
          max1 = arr[0];
          if (arr[1]>=arr[2]){
              max2 = arr[1];
              max3 = arr[2];
          }else{
              max2 = arr[0];
              max3 = arr[1];
          }

        } else if(arr[1]>=arr[0]&&arr[1]>=arr[2]) {
            max1 = arr[1];
            if (arr[0]>=arr[2]){
                max2 = arr[0];
                max3 = arr[2];
            }else{
                max2 = arr[2];
                max3 = arr[0];
            }

        }else{
            max1 = arr[2];
            if (arr[0]>=arr[1]){
                max2 = arr[0];
                max3 = arr[1];
            }else{
                max2 = arr[1];
                max3 = arr[0];
            }
        }
        for (int i = 3; i < arr.length; i++) {
            if (arr[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max3 = max2;
                max2 = arr[i];
            } else if (arr[i] > max3) {
                max3 = arr[i];
            }
        }


        System.out.println("\nfirst largest elemant is : " + max1);
        System.out.println("second largest elemant is : " + max2);
        System.out.println("third largest elemant is : " + max3);
    }
}
