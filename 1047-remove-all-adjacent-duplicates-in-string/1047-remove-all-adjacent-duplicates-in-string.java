class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty()){
                if(st.peek()==ch){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }else{
                st.push(ch);
            }
        }
        String res="";
        while(!st.isEmpty()){
            res=st.pop()+res;
        }
        // System.out.println(st);
        return res;
    }
}