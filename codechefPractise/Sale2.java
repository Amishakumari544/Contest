// /* package codechef; // don't place package name! */
// There is a sale going on in Chefland. For every 22 items Chef pays for, he gets the third item for free (see sample explanations for more clarity).

// It is given that the cost of 11 item is XX rupees. Find the minimum money required by Chef to buy at least NN items.

// Input Format
// First line will contain TT, number of test cases. Then the test cases follow.
// Each test case contains of a single line of input, two integers NN and XX.
// Output Format
// For each test case, output the minimum money required by Chef to buy at least NN items.

// Constraints
// 1≤T≤10001≤T≤1000
// 1≤N,X≤10001≤N,X≤1000
// Subtasks
// Subtask 1 (100 points): Original constraints.
// Sample Input 1 
// 4
// 3 4
// 4 2
// 5 3
// 6 1
// Sample Output 1 
// 8
// 6
// 12
// 4
// Explanation
// Test Case 11: Chef wants 33 items where the cost of each item is 44 rupees. To minimise the expenditure, Chef can pay for 22 items and get the third item for free. This way, the total money required is 4⋅2=84⋅2=8 rupees.








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
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int h = a/3;
		    int m = (a-h)*b;
		    System.out.println(m);
		}
	}
}

