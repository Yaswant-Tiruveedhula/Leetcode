class Solution {
    public int maximumProduct(int[] nums) {

        int m1=-1001;//nums[0];
        int m2=-1001;//nums[1];
        int m3=-1001;//nums[2];
        // int max1=Math.max(m1,Math.max(m2,m3));
        // int max2=Math.min(m1,Math.min(m2,m3));

        int min1=1001;//nums[0];
        int min2=1001;//nums[1];
        for(int i:nums){
            if(i>m1){
                m3=m2;
                m2=m1;
                m1=i;
            }
            else if(m2<i){
                m3=m2;
                m2=i;
            }else if(m3<i){
                m3=i;
            }

            if(i<min1){
                min2=min1;
                min1=i;
            }else if(i<min2){
                min2=i;
            }
        }
        System.out.println(m1+" "+m2+" "+m3+" "+min1+" "+min2);
        return Math.max(m3*m2*m1,m1*min1*min2);
    }
}