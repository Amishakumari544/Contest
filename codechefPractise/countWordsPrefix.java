class Solution {
    public int prefixCount(String[] words, String pref) {
    int c = 0;
    for(String s : words) {
        if(s.indexOf(pref)==0) 
            c++;
    }
    return c; 
    }
}

//always use eqauls or index of for strings
// it can be implemented by trie also
public class Main {
    public static void main(String[] args) {
      String[] words = { "GEEKS", "FOR", "GEEKS" };
     int c = 0;
      for(String s : words) {
          if(s.equals("GEEKS")) 
              c++;
      }
      System.out.println(c);
    }
  }

  
  class Solution {
    public int prefixCount(String[] words, String pref) {
     int n=words.length;
       int m=pref.length();
       int cnt=0;
       for(int i=0;i<n;i++){
           if(words[i].length() >=m && words[i].substring(0,m).equals(pref)){
               cnt++;
           }
       }
       return cnt;
       }
       }