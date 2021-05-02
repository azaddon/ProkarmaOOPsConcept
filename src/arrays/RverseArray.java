package arrays;

public class RverseArray {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int arr[] = new int[]{2,5,7,9,3,9,1,4,5};
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int j=arr.length-1;j>=0;j--){
			System.out.print(arr[j]+" ");
		}*/
		
		String str ="JAVATPOINT";
		for(int i=str.length();i>0;i--){
			System.out.print(str.charAt(i-1));
		}
	}

}
