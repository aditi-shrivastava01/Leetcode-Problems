class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            if( i == 0 || nums[i] != nums[i-1] ){
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        for(int count : map.values()){
            if(count == 1){
                ans++;
            }
        }
        return ans;
    }
}