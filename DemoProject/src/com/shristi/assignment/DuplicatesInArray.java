package com.shristi.assignment;

import java.util.Arrays;

public class DuplicatesInArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int ar[] = {6,1,2,9,9,3,9,8,5};
 countDuplicate(ar);
	}
	static void countDuplicate(int ar[])
	{
		Arrays.sort(ar);
		for(int i=0; i<ar.length-1;i++)
		{
			int count=1;
			for(int j=i+1; j<ar.length;j++)
			{
				if(ar[i]==ar[j])
					count++;
				else
					break;
			}
			if(count>1)
			{
				System.out.println(ar[i]+"-> "+count);
				i+=(count-1);
					
			}
			
				
		}
	}

}
