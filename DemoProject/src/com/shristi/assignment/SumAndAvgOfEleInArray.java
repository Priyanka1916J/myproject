package com.shristi.assignment;

public class SumAndAvgOfEleInArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr= {1,2,3,4,5};
    int length =arr.length;
    int sum=0;
    for(int i=0;i<length;i++) 
    {
    	sum=sum +arr[i];
    }
    System.out.println("sum of the elements of array: "+sum);
    float Avg =sum/length;
    System.out.println("Avg of the elements of array: "+Avg);
	}
}
