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
		   int X = sc.nextInt();
		   int Y = sc.nextInt();
		   int Z = sc.nextInt();
		   
		    int res =  Y / X;
		    // System.out.println(res);
		    int ans = Z - res;
		    if(res > Z){
		    System.out.println("0");
		    }
		   else{
		     System.out.println(ans);
		   }
		}
		}
}
