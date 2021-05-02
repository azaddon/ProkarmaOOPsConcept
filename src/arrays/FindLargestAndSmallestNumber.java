package arrays;

import java.util.Scanner;

public class FindLargestAndSmallestNumber {

	public static void main(String[] args) {
		int i,arr[] = {2,4,6,1,7,9,2,6};
		int small,large;
		small =large=arr[0];
		for(i=1;i<arr.length;i++){
			if(arr[i]<small)
				small=arr[i];
			if(arr[i]>large)
				large=arr[i];
		}
		System.out.println("Smallest number is:::"+small+" &&&&&& Largest number is::"+large);
	}

}
