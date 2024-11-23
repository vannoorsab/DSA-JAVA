//https://leetcode.com/problems/find-maximum-number-of-string-pairs/
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int index=0;
        HashMap<String,Integer>map=new HashMap<>();
        for(String word:words){
            String reversed=new StringBuilder(word).reverse().toString();
            if (map.containsKey(reversed)){
                index++;
                map.remove(reversed);
            }
            else{
                map.put(word,map.getOrDefault(word,0)+1);
            }
        }
        return index;
        
    }
}