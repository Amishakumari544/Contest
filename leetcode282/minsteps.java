//anagram |
class Solution {
    public int minSteps(String s, String t) {
         int ans = 0;
    int[] sCounter = new int[26], tCounter = new int[26];
    for(char ch: s.toCharArray()) sCounter[ch - 'a']++;
    for(char ch: t.toCharArray()) tCounter[ch - 'a']++;
    for (int i = 0; i < 26; i++) ans += Math.abs(sCounter[i] - tCounter[i]);
    return ans;
    }
}



//anagram ||
class Solution {
    public int minSteps(String s, String t) {
        int[] freq = new int[26];
        int min=0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
         for(int i=0;i<t.length();i++){
        if(freq[t.charAt(i)-'a']>0){
                 freq[t.charAt(i)-'a']--;
             }else{
                 min++;
             }
         }
        return min;
    }
}