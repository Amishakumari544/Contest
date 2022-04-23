/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0){

		    int N = sc.nextInt();
		    int[] A = new int[N-1];
		    int X = sc.nextInt();
		    
		    for (int i = 0; i < A.length;i++){
		      A[i] = sc.nextInt();
		    }
		     int missnum = 0;
		    for(int i = 0; i < A.length ;i++){
  		    missnum += A[i];
		    } 
		    int ans = N * X; // 12 - 6
  		  int result = ans - missnum;
  		 
		    if(result < 0){
		      System.out.println("0");
		    }else{
		       System.out.println(result);
		    }
		    }
	}
}
