class Solution { //tc--O(N^2)
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n= nums.length;
        int count=0;
        for(int i=0; i<n ; i++){
            int sum=0;
            for(int j=i; j<n; j++){ //prefix sum
                sum= sum+ nums[j];
                if(sum == goal) count++;
            }
        }
        return count;
    }
}