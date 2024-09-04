package com.shristi.assignment;

public class SecondLargestNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {8,2,5};
      int temp, size;
      size= arr.length;
      System.out.println("Array size is" +" "+size);
      for(int i=0;i<size;i++) {
    	  for(int j=0;j<size;j++) 
    	  {
    		  if(arr[i]>arr[j]) 
    		  {
    			  temp=arr[i];
    			  arr[i]=arr[j];
    			  arr[j]=temp;
    		  }
    	  }
      }
      System.out.println();
      System.out.println("Ele of array in ascending order");
      for(int i=0; i<size; i++) {
    	  System.out.print(arr[i] +" ");
    	  }
          System.out.println();
          System.out.println("second largest number is" +" "+arr[size-2] );
      }
}
