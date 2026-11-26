class Solution {
    public boolean canAliceWin(int n) {
        int t=1;
        int need=10;
        while(n>=need){
            n-=need;
            t=1-t;
            need--;
        }
        return t==0;
    }
}