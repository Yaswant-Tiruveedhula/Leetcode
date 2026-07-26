class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1=new Stack<>(),st2=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='#'){
                if(!st1.isEmpty()){
                st1.pop();
            }
            }else{
                st1.push(ch);
            }
        }
        for(char ch:t.toCharArray()){
            if(ch=='#'){
                if(!st2.isEmpty()){
                st2.pop();
                }
            }else{
                st2.push(ch);
            }
        }
        while(!st1.isEmpty()){
            if(st2.isEmpty()){
                return false;
            }
            if(st1.peek()!=st2.peek()){
                return false;
            }
            st1.pop();
            st2.pop();
        }
        return st2.isEmpty();
    }
}