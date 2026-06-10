public class reverseArray {
    public static void main(String[] args) {
        int arr[] = {16,2,30,42,5,64,7};
        int n = arr.length;
        for (int i=0 ; i <arr.length/2;i++){
           int temp;
            temp = arr[i];
           arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        for(int i=0 ; i <arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
