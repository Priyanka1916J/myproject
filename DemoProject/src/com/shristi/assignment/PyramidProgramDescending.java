package com.shristi.assignment;

public class PyramidProgramDescending {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1; i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i; k<=5;k++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}
