class Solution {
    public static HashMap<Integer,Integer> map;
    public Solution(){
        map=new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        map.put(4,4);
        map.put(5,5);
        map.put(6,6);
        map.put(7,7);
        map.put(8,8);
        map.put(9,10);
        map.put(10,12);
        map.put(11,14);
        map.put(12,16);
        map.put(13,18);
        map.put(14,20);
        map.put(15,22);
        map.put(16,24);
        map.put(17,27);
        map.put(18,30);
        map.put(19,33);
        map.put(20,36);
        map.put(21,39);
        map.put(22,42);
        map.put(23,45);
        map.put(24,48);
        map.put(25,52);
        map.put(26,56);
    }
    public int minimumPushes(String word) {
        return map.get(word.length());
        // int len=word.length();
        // int cou=0;
        // int time=1;
        // while(len>0){
        //     if(len>8){
        //     cou+=(8*time);
        // }else{
        //     cou+=(len*time);
        // }
        // time++;
        //     len-=8;
        // }
        // return cou;
    }
}