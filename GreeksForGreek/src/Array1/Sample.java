package Array1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Simple Java program for Array
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class Sample 
{
	public static void main(String args[])
	{
		int t;//test cases
		int a[]=new int[50];	    
		int n;
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter test cases:");
		t=sc.nextInt();
		if(t<=100)
		{	
			for(int j=0;j<t;j++)
			{
				System.out.println("Enter input");
		        n=sc.nextInt();
		       
		        if(n<=100)
		        {
		           for(int i=1;i<=n;i++)
		           {
		        	   a[i]=sc.nextInt();
		           }
		           if(n>1)
		           {
		               int sum=0;
			           for(int i=1;i<=n;i++)
			           {
			        	   sum+=a[i];
		                   
		                }
			           System.out.print(sum+" ");
			            avg=sum*1.0/n*1.0;//double d = num * 1.0 / denom;
				   		DecimalFormat dec = new DecimalFormat("#0.00");
				   		System.out.print(dec.format(avg)+"\n");
				   		
			        }
		        	        }
			}
		}
	}
}
		
/*
2
15
988 857 744 492 228 366 860 937 433 552 438 229 276 408 475 
22
859 396 30 238 236 794 819 429 144 12 929 530 777 405 444 764 614 539 607 841 905 819
*/