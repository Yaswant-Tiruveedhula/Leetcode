class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        int min=101,max=0;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
            if(max<nums[i]){
                max=nums[i];
            }
            arr.add(nums[i]);
        }
        List<Integer> res=new ArrayList<>();
        for(int i=min+1;i<max;i++){
            if(!arr.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}