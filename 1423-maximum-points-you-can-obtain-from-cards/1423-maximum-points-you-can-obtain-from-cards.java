//ya to right se card le skte ya left se, aur dono m se jiska max hoga vo ans chahiye
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int[] arr = cardPoints;
        int n = arr.length;
        int lsum = 0; 
        int max = Integer.MIN_VALUE;
        //pre compute (first k ele sum)
        for(int i = 0; i<k ; i++){
            lsum = lsum + arr[i];
        }
        max = lsum;
        int rsum = 0; //right sum
        int li = n-1; //last index
        //starting from second
        for(int i=k-1; i>=0; i--){
            //shrink 
            lsum = lsum - arr[i];
            //expand
            rsum = rsum + arr[li];
            li--;
            //update
            max = Math.max(max, lsum+rsum);
        }
        return max;
    }
}