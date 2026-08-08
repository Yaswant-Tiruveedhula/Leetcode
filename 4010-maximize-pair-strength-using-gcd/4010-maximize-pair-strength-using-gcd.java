class Solution {
    public long maxPairStrength(int[] nums) {
        Arrays.sort(nums);
        // int div=gcd(nums[nums.length-2],nums[nums.length-1]);
        // div*=div;
        int j=nums.length-1;
        int i=j-1;
        long max=0;
        while(i>=0){
            long mul=(long)(nums[j])*(long)nums[i];
            int div=gcd(nums[i],nums[j]);
            long let=mul/(long)(div*div);
            if(max<let){
                max=let;
            }
            i--;
            if(i==-1){
                j-=1;
                i=j-1;
            }
        }
        return max;
        // return (long)((long)nums[nums.length-2]*nums[nums.length-1])/((long)div);
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
}