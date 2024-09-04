package com.shristi.assignment;

public class PerfectNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=10;
      int sum=0;
      for( int i = 1;i<=n-1;i++)
      {
    	  if(n/i==0)
    	  {
    		  sum=sum+i;
    	  }
    	  if(sum==n)
    		  System.out.println("Perfect");
    	  else
    		  System.out.println("Not Perfect");
    		  
    		  }
	}
}
