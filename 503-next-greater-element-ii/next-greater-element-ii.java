class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[]ans=new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer> stack=new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<2*n;i++){
            int curr=nums[i%n];
            while (!stack.isEmpty() && nums[stack.peek()] < curr) {
                int idx = stack.pop();
                map.put(idx, curr);
            }
            if (i<n){
                stack.push(i);
            }
        }
        for (int i = 0; i < n; i++) {
            if (map.containsKey(i)) {
                ans[i] = map.get(i);
            }
        }
        return ans;
    }
}