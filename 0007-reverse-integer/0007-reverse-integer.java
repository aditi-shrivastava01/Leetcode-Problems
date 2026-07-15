class Solution {
    public int reverse(int x) {
        int rev =0;
        return(reverse(rev , x));
    }
    public int reverse(int rev, int n){
        if( n == 0) return rev;
        //overflow check -2^31 ya 2^31 wala case
        if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10){
            return 0;
        }
        return reverse(rev*10+n%10, n/10);
    }
}