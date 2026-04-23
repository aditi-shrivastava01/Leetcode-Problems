class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int arrsum=0;
        for(int i=0; i<n; i++){
            arrsum= arrsum + nums[i];
        }
        int sum= n*(n+1)/2;
        return sum-arrsum;
    }
}