package Array1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Simple Java program for 1-D and 2-D Array
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
 
public class oneAndTwoDArray 
{
	public static void main(String[] args) 
	{
/*		int t;//test cases
		int n,temp;
		int a[]=new int[100];
		int b[][]=new int[100][100];
		
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
		        	for(int i=0;i<n;i++)
		        	{
		        		for(int k=0;k<n;k++)
		        		{
		        			b[i][k]=sc.nextInt();
		        		}
		        	}
		        	
		        	int sum=0;
		        	for(int i=0;i<n;i++)
		        	{
		        		for(int k=0;k<n;k++)
		        		{
		        			if(b[i][k]==b[k][i])
		        			{
		        				sum+=b[i][k];
		        			}
		        		}
		        	}
		        	
		        	for(int l=0;l<n;l++)
		        	{
		        		a[l]=sc.nextInt();
		        	}
		        	System.out.print(sum+" ");
		        	
		        	for(int l=0;l<n;l++)
		        	{
		        		for(int m=0;m<l;m++)
		        		{
		        			if(a[l]<a[m])
		        			{
		        				temp=a[l];
		        				a[l]=a[m];
		        				a[m]=temp;
		        			}
		        		}
		        	}
		        	System.out.println(a[n-1]);
		        	
		        	
		        	
		        	

		        	
		        }
			}
	}*/
		
		Scanner sc=new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t-->0)
		 {
		     int n=sc.nextInt();
		   
		     int arr[][]=new int[n][n];
		     for(int i=0;i<n;i++)
		     {
		        for(int j=0;j<n;j++)
		        {
		             arr[i][j]=sc.nextInt();
		        }
		     }
		     int arr1[]=new int[n];
		       for(int i=0;i<n;i++)
		     {
		         arr1[i]=sc.nextInt();
		  
		     }
		     int sum=0;
		  int k=0;int l=0;
		  while(k<n&&l<n)
		  {
		      sum+=arr[k][l];
		      k++;
		      l++;
		  }
		  Arrays.sort(arr1);
		  System.out.println(sum+" "+arr1[n-1]);
		  

	}
	}
	}
