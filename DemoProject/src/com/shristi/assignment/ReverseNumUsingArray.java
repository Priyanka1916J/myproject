package com.shristi.assignment;

public class ReverseNumUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {10,20,30,40,50};
		for (int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("After reversing array");
		for(int j=ar.length-1;j>=0;j--)
		{
			System.out.println(ar[j]);
		}
				
	/*	int a[] = {1,2,3,4,5,6};
		int i=0,j=a.length-1,temp;
		while(i<j)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(a));*/
		
	}}
