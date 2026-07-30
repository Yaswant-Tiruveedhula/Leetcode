class Solution {
    public int minimumPushes(String word) {
        int len=word.length();
        int cou=0;
        int time=1;
        while(len>0){
            if(len>8){
            cou+=(8*time);
        }else{
            cou+=(len*time);
        }
        time++;
            len-=8;
        }
        return cou;
    }
}