class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");  // split sentence into words
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            result.append(sb.reverse()); // reverse each word

            if (i < words.length - 1) {
                result.append(" ");      // add space between words
            }
        }

        return result.toString();
    }
}
