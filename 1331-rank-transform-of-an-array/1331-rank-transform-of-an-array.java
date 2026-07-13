class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;//ek copy arr banao taki usme rank store kre
        int[] copy = new int[n];
        for(int i=0; i<n; i++){
            copy[i] = arr[i];
        }
        Arrays.sort(copy);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank=1;
        for(int i =0; i<copy.length; i++){
            if(map.containsKey(copy[i]) == false){
                map.put(copy[i] , rank++);
            }
        }
        for(int i =0; i<arr.length; i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}