package com.shristi.assignment;

public class SmallestNumberInArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {85, 25,67,9,25,6};
		int Snum = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<Snum)
			{
				Snum = arr[i];
			}
		}
      System.out.println("the Smallest number is:"+Snum);

	}
}
