import java.util.Scanner;

public class checkIFsorted {
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
//        int i=0;
//            while(arr[i]!=arr.length-1){
//            if(arr[0]>arr[i]){
//                System.out.println("sorted");
//
//            } else{
//                System.out.println("not");
//            }
//            i++;
        int count =0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i]>arr[i+1]) {
              count++;
            }

        }
        if (count ==0){
            System.out.println("sorted");
        }else{
            System.out.println("not sorted");
        }






    }
}
