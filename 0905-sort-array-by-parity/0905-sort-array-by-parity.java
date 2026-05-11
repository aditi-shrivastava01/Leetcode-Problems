class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int low=0;
        int high=n-1;
        for(int i=0; i<n; i++){
            if( nums[i] % 2 == 0){
                ans[low] = nums[i];
                low++;
            }
            else{
                ans[high] = nums[i];
                high--;
            }
        }
        return ans;
    }
}