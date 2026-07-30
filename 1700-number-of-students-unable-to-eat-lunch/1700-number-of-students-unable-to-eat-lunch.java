class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> std=new ArrayDeque<>();
        Queue<Integer> snd=new ArrayDeque<>();
        int n=students.length;
        for(int i=0;i<n;i++){
            std.offer(students[i]);
            snd.offer(sandwiches[i]);
        }
        // System.out.println(std+" "+snd);
        int k=0;
        while(!std.isEmpty()&&k!=n){
            if(std.peek()==snd.peek()){
                std.poll();
                snd.poll();
                k=0;
                n--;
            }else{
                std.offer(std.poll());
                k++;
            }
        }
        return std.size();
    }
}