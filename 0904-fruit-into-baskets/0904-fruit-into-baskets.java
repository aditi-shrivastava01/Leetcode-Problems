class Solution {
    public int totalFruit(int[] fruits) {
        int[] arr = fruits;
        int n = arr.length;
        int left = 0;
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for( int right = 0; right < n; right++){
            map.put(arr[right], map.getOrDefault(arr[right],0) + 1);
            while(map.size() > 2){ ///shrink
              map.put(arr[left], map.get(arr[left]) -1);
              if(map.get(arr[left]) == 0){
                map.remove(arr[left]);
              }
              left++;
            }
        max = Math.max(max , right - left + 1);
        }
    return max;
    }
}