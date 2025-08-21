class Solution {
    public int lengthOfLastWord(String s) {
        String words[] = s.split(" ");//spliting of words
        String lastword = words[words.length-1];
        int length = lastword.length();
        return length;
        






        
    }
}