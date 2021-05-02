package arrays;

public class SampleArray {
	static int count = 0;
	public static void main(String[] args) {
		
		int[] arr ={2,1,6,1,6,3};
		int i,j;
		
		 for (i=1;i<=arr.length;i++){
			 for(j=0;j<arr.length;j++){
				 
				 if(arr[j]==i){
					count++;
				 }	
			 }
			 System.out.println(i + " "+ count);
		 }
		 
	}

}
