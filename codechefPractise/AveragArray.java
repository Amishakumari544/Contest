import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		    int t = sc.nextInt();
		
	    	while(t-->0){

		    int n = sc.nextInt();
		    int x = sc.nextInt();
        int b = n/2;
        System.out.println(b + " jj");
        if(n%2==0)
        {
            for(int i=x-b;i<=x+b;i++)
            {
            //     if(i!=x)
            // System.out.println(i + " kk");
            
        }
        }
        // else
        for(int i=x-b;i<=x+b;i++){
        System.out.println(i);
        }
	    	}
    }
}