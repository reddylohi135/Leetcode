class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left<right){   //hello
            char temp =s[left];// = h
            s[left] = s[right]; // s[0] =o
            s[right] = temp;//s[4] = h
            left++;
            right--;
        }
        }
}
        
    
