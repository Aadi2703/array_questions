import java.util.Scanner;

public class removedupiicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elemants");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elems");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("your array ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
  int newsize = 0;
        int [] temp = new int[n];
        for (int i=0;i<n;i++){
            boolean duplicate = false;
            for (int j =0;j<newsize;j++){
                if (arr[i]==temp[j]){
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate){
                temp[newsize] = arr[i];
                newsize++;
            }
        }
        System.out.println();
        for (int i=0;i<newsize;i++){
            System.out.print(temp[i] + " ");
        }

    }
}