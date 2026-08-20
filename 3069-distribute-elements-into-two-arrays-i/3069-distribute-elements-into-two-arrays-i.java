class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        arr1[0]=nums[0];
        arr2[0]=nums[1];
        int ind1=0;
        
        int ind2=0;
        for(int i=2;i<n;i++){
            int val=nums[i];
            if(arr1[ind1]>arr2[ind2]){
                ind1+=1;
                arr1[ind1]=val;
            }else{
                ind2+=1;
                arr2[ind2]=val;
            }
        }
        for(int i=0;i<=ind1;i++){
            res[i]=arr1[i];
        }
        ind1++;
        for(int i=0;i<=ind2;i++){
            res[ind1++]=arr2[i];
        }
        return res;
    }
}