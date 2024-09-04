package com.shristi.assignment;

public class NumberGreaterInArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,5,3,569, 354, 2, 9};
		int Gnum = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]> Gnum)
			{
				Gnum = arr[i];
			}
		}
      System.out.println("the Greatest number is:"+Gnum);
}
}
