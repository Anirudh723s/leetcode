class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> q = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            if (!q.isEmpty() && q.peekLast() == ch) {
                q.pollLast();
            } else {
                q.offerLast(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!q.isEmpty()) {
            ans.append(q.pollFirst());
        }
        return ans.toString();
    }
}
