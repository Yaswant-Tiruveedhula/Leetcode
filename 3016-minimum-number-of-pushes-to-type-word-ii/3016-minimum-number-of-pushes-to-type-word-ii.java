class Solution {
    public int minimumPushes(String word) {
        int[] arr=new int[26];
        for(char ch:word.toCharArray()){
            arr[ch-'a']++;
        }
        int count=0;
        Arrays.sort(arr);
        int i=25;
        int m=1;
        int let=0;
        while(i>=0&&arr[i]>0){
            // System.out.println(count);
            count+=arr[i]*m;
            let++;
            if(let==8){
                m++;
                let=0;
            }
            i--;
        }
        return count;
    }
}