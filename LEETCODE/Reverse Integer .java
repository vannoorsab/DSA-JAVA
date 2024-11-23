class Solution {
    public int reverse(int x) {

        int MIN = -2147483648;
        int MAX = 2147483647;
        long reverseResult =0;
            while(x != 0){

            int reminder = x % 10;
            x = x/10;
            reverseResult = (10 * reverseResult) + reminder;
        }

      
        if(reverseResult > Integer.MAX_VALUE || reverseResult < Integer.MIN_VALUE )
        {
            return 0;
        }
        return (int)reverseResult;

    }
}
