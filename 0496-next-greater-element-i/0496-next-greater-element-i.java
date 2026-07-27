class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int j=0;
            while(j<nums2.length){
                if(nums1[i]==nums2[j]){
                    break;
                }
                j++;
            }
            for(;j<nums2.length;j++){
                if(nums1[i]<nums2[j]){
                    res[i]=nums2[j];
                    break;
                }
            }
            if(res[i]==0){
                res[i]=-1;
            }
        }
        return res;
    }
}