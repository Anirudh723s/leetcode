class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int Sum=0;
        int count=0;
        for(int num:nums){
            Sum+=num;
            if (map.containsKey(Sum-k)) {
                count += map.get(Sum-k);
            }
            map.put(Sum,map.getOrDefault(Sum,0)+1);
        }
        return count; 
    }
}