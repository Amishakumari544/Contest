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
  