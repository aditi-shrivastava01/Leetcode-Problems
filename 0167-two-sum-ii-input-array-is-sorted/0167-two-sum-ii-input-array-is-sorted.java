class Solution {  //approach-----1) brute force[O(N^2)] 2)two pointer [O(N)]
    public int[] twoSum(int[] numbers, int target) {
         //by two pointer
         int n= numbers.length;
         int[] res= new int[2];
         int low=0;
         int high= n-1;
         while( low < high){
            if(numbers[low] + numbers[high] == target){
                res[0] = low +1;
                res[1] = high +1;
                return res;
            }
            else if(numbers[low] + numbers[high] > target){
                high--;
            }
            else{
                low++;
            }
         }
         return res;
    }
}