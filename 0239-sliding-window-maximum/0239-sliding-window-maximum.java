class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<k;i++){
            while(!dq.isEmpty()&&nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        arr.add(nums[dq.peekFirst()]);
        for(int i=k;i<nums.length;i++){
            if(nums[i-k]==nums[dq.peekFirst()]){
                dq.pollFirst();
            }
            while(!dq.isEmpty()&&nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            arr.add(nums[dq.peekFirst()]);
        }
        // System.out.println(arr);
        int[] res=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }
        return res;
    }
}