class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        if(k==1){
            int[] fre=new int[51];
            for(int i:nums){
                fre[i]++;
            }
            for(int i=50;i>=0;i--){
                if(fre[i]==1){
                    return i;
                }
            }
            return -1;
        }
        if(k==n){
            Arrays.sort(nums);
            return nums[n-1];
        }
        int val1=nums[0];
        int val2=nums[n-1];
        int freq1=0,freq2=0;
        for(int i:nums){
            if(i==val1){
                freq1++;
            }
            if(i==val2){
                freq2++;
            }
        }
        return freq1>1&&freq2>1?-1:freq1==freq2?Math.max(val1,val2):freq1>1?val2:val1;
    }
}