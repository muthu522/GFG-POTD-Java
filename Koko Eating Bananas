class Solution {
    public int kokoEat(int[] arr, int k) {
         int low = 1, high = 0;
        for (int x : arr) high = Math.max(high, x);
        while (low < high) {
            int mid = low + (high - low) / 2;
            long hours = 0;
            for (int x : arr) {
                hours += (x + mid - 1) / mid; 
            }
            if (hours <= k) high = mid;   
            else low = mid + 1; 
        }
        return low;
    }
}
