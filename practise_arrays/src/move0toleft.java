import java.util.Scanner;

public class move0toleft {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("enter the number of elem");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the elems");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("your array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int j=0;
for (int i=0;i<n;i++){
    if (arr[i]!=0){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        j++;
    }
}
System.out.println("after shifting 0 top left");
for (int i=0;i<n;i++) {

            System.out.print(arr[i] + " ");

        }
    }
}