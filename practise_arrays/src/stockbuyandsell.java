import java.util.Scanner;

public class stockbuyandsell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elemants");
        int n = sc.nextInt();
        int[] price = new int[n];
        System.out.println("enter the elems");
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        System.out.println("your array ");
        for (int i = 0; i < n; i++) {
            System.out.print(price[i] + " ");
        }
        int minprice = price[0];
        int maxprofit =0;
        int profit;
        for (int i=0;i<n;i++){
            if (minprice>price[i]){
                minprice = price[i];
            }
           profit = price[i] - minprice;
            if (profit>maxprofit){
                maxprofit = profit;
            }
        }
        System.out.println();
        System.out.println("max profit is : " + maxprofit);


    }
}
