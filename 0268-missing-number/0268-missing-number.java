class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        Set <Integer> set= new HashSet<>();
        for( int ele: nums){
            set.add(ele);
        }
        for(int i=0; i<=n; i++){
            if(set.contains(i)== false) return i;
        }
        return -1;
    }
}
// SC---> n-->1
// TC---> 2n -->n