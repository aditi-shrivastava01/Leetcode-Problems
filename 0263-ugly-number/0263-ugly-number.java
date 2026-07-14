class Solution { //recursive approach
    public boolean isUgly(int n) {
        if(n<=0) return false;
        return check(n);
    }
    public boolean check(int n){
        if(n==1) return true;
         if(n % 2 == 0){
            n= n/2;
            return check(n);
         }
         if(n % 3 == 0){
            n= n/3;
            return check(n);
         }
         if (n % 5 == 0){
            n= n/5;
            return check(n);
         }
         return false;
    }
}