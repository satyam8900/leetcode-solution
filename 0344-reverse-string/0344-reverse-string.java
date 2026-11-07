class Solution {
    public void reverseString(char[] s) {
        int p = 0;
        int q = s.length-1;
        char temp ;
        while(p<q){
            temp= s[p];
            s[p]=s[q];
            s[q]=temp;
            p++;
            q--;
        }
    }
}