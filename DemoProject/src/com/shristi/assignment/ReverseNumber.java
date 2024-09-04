package com.shristi.assignment;

public class ReverseNumber {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	int n=676389, rev=0;
	while(n!=0)
		
	{
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	System.out.println("The reverse of the number is"+" "+rev);
}
}
