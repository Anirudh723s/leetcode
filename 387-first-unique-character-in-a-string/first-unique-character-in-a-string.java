class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) -'a']++;
            }
        for (int i = 0; i < s.length(); i++) {
            queue.offer(i);
        }
        while(!queue.isEmpty()){
            int index = queue.peek ();
            char ch=s.charAt(index);
            if(freq[ch-'a']==1){
                return index;
            }
            queue.poll();
        }
        return -1;
    }
}