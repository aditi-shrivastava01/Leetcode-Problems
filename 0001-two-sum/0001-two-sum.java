class Solution { //two pointers lgega qki 2 element ki baat hori
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int ans[] = new int[2];
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                ans[0] = i;
                ans[1] = j;
                break;
                }
            }
        }
       return ans;
    }
}