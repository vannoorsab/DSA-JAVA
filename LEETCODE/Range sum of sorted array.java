//By using brute force Approach(Navie Approach)
import java.util.*;

class Solution {
    public int  rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer>add =new ArrayList<>();
        for(int start=0;start<nums.length;start++){
            int sum=0;
            for(int end=start;end<nums.length;end++){
                sum+=nums[end];
               add.add(sum);
            }
        }
      
       Collections.sort(add);
        
        
        int result = 0,mod=(int) 1e9 + 7;
                for (int i = left - 1; i <=right-1; i++) {
            result = (result+ add.get(i))%mod ;
        }

        return  result;
    
}
}