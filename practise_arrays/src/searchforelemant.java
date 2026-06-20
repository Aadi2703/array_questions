import java.util.Scanner;
public class searchforelemant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elemants");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elems");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the elemants to find");
        int key = sc.nextInt();
        int count =0;


        System.out.println("your array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < n; i++) {

            if (arr[i]==key){
           count++;
            }
        }
        System.out.println();
        System.out.println( key+" repeat "+ count + " times");
   }
}
