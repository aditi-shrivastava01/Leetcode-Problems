class Solution { //number ko 2 se divide kro jitti baar 1 aaye reminder m voi ans h
    public int hammingWeight(int n) {
        int count=0;
        while( n != 0){
            if(n%2 != 0 ){
                count++;
            }
            n=n/2;
        }
        return count;
    }
}