class Solution {
    public int findMinDiff(int arr[], int m) {
      
      Arrays.sort(arr);
      
      int mindiffrence = Integer.MAX_VALUE;
      
      for(int i = 0 ; i+m-1<arr.length;i++){
      
      int actualdiffrence = arr[i+m-1] - arr[i];
      
      mindiffrence = Math.min(mindiffrence , actualdiffrence);
      
          
      }
          return mindiffrence;

      
      
      
      
        
    }
}
