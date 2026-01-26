class Solution {
    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        helper(res,new ArrayList<>(),arr);
        return res;
    }
    static void helper(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> temp,int[] nums){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int n:nums){
            if(temp.contains(n)) continue;
            temp.add(n);
            helper(res,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
}
