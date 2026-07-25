class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        while(n>0){
            arr.add(n%10);
            n=n/10;
        }
        Collections.sort(arr);
         n=arr.size();
        return arr.get(n-1)*arr.get(n-2);
    }
}