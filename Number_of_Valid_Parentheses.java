import java.util.*;
class Number_of_Valid_Parentheses{
    int findWays(int n) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        String str = "";
        if(n%2!=0) return 0;
        helper(n/2,n/2,ans,str);
        return ans.size();
    }
    public void helper(int open,int close,ArrayList<String> ans,String str){
        if(open==0 && close==0){
            if(!ans.contains(str)) ans.add(str);
        }
        if(open>0){
            helper(open-1,close,ans,str+"(");
        }
        if(close>open){
            helper(open,close-1,ans,str+")");
        }
    }
}
