class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i:asteroids){
            // System.out.println(st);
            if(!st.isEmpty()){
                if(st.peek()>0&&i>0){
                    st.push(i);
                }else if(st.peek()<0&&i<0){
                    st.push(i);
                }else{ 
                    if(i>0){
                        st.push(i);
                    }else{
                        boolean let=true;
                        int j=-i;
                        while(!st.isEmpty()&&st.peek()>0){
                        int peek=st.peek();
                        if(peek<j){
                            st.pop();
                        }else if(st.peek()==j){
                            let=false;
                            st.pop();
                            break;
                        }
                        else{
                            break;
                        }
                    }
                    if(!st.isEmpty()&&(st.peek()<0&&let==true)){
                        st.push(i);
                    }
                    else if(st.isEmpty()&&let==true){
                        st.push(i);
                    }
                    }
                }
            }else{
                st.push(i);
            }
        }
        int[] arr=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            arr[i]=st.pop();
        }
        return arr;
    }
}