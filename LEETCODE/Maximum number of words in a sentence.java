//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int ans=0;
        for(int i=0;i<sentences.length;i++){
            int size=0;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                    size++;
                }
            }
            ans=Math.max(ans,size+1);
        }
        return ans;
    }
}