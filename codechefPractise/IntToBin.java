public class IntToBin {
    
}
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
  
       // write ur code here
       	int A = sc.nextInt();
			int B = sc.nextInt();
			// int c = a * b;
      // System.out.println(c);
      // System.out.println(Integer.toBinaryString(c));
  
    long res = A*B;
    int bits = 0;
    while(res!=0){
      if(res%2==1){
        bits++;
      }
      res = res/2;
    }
    System.out.println(bits);
   }
  }


 