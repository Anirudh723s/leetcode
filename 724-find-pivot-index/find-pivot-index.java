class Solution {
    public int pivotIndex(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            int rightSum=totalSum-leftSum-nums[i];
            map.put(i,rightSum);
            if(leftSum==map.get(i)){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}