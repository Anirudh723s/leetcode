class Solution {
    public int smallestUniqueSubarray(int[] nums) {
        final long BASE=1000003L,MOD=1000000007L;
        int n = nums.length;
        long[] h = new long[n + 1],p=new long[n+1];
        p[0]=1;
        for(int i=0;i<n;i++){
            long x=((nums[i]%MOD)+MOD)%MOD;
            h[i+1]=(h[i]*BASE+x)%MOD;
            p[i+1]=(p[i]*BASE)%MOD;
        }
        int left=1,right=n;
        while(left<right){
            int mid=left+(right-left)/2;
            if(check(mid,n,h,p,MOD)) right=mid;
            else left=mid+1;
        }
        return left;
    }
    private boolean check(int len,int n,long[] h,long[] p, long MOD){
        Map<Long,Integer>cnt=new HashMap<>();
        for(int i=0;i<=n-len;i++){
            long val=(h[i+len]-(h[i]*p[len])%MOD+MOD)%MOD;
            cnt.put(val,cnt.getOrDefault(val,0)+1);
        }
        for(int v:cnt.values()){
            if(v==1) return true;
        }
        return false;
    }
}