class Solution {
    public int getCount(int n, int d) {
        int left = 1,right = n;
        int ans = -1;
        while(left<=right){
            int mid = (right+left)/2;
            int val = mid-Sum(mid);
            if(val>=d){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        if(ans==-1) return 0;
        return n-ans+1;
        
    }
    public int Sum(int x){
        int sum = 0;
        while(x>0){
            sum +=x%10;
            x/=10;
        }
        return sum;
    }
};
