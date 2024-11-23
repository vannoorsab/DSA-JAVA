class Solution {
    public boolean isPalindrome(int x) {
        int sum=x;
        int sum1=0;
        while(x>0){
            int t=x%10;
            sum1=sum1*10+t;
            x/=10;
        }
        return sum==sum1;
        /*if(sum1==sum){
            return true;
        }
        else{
            return false;
        }*/
        
    }
}