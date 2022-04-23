/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int min = a;
		if(min>=b){
		    min = b;
		    	System.out.println(a+c);
		}else if(c<=min){
		    min = c;
		    	System.out.println(b+a);
		}else{
		System.out.println(b+c);
		}
		}
	}
}
