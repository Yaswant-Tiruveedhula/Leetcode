class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st=new Stack<>();
        int[] res=new int[prices.length];
        for(int j=prices.length-1;j>=0;j--){
            while(!st.isEmpty()&&st.peek()>prices[j]){
                st.pop();
            }
            if(!st.isEmpty()){
                res[j]=prices[j]-st.peek();
            }else{
                res[j]=prices[j];

            }
            st.push(prices[j]);
        }
        return res;
    }
}