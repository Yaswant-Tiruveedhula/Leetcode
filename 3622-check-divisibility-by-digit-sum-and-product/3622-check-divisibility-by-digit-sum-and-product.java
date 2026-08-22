class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int val=n;
        int pro=1;
        while(val>0){
            sum+=(val%10);
            pro*=val%10;
            val/=10;
        }
        return n%(sum+pro)==0;
    }
}