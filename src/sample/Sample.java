package sample;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public  class  Sample {
	

	public static void main(String[] args) {
		
//     int[] a ={2,1,3,3,4,5};
//     int[] b = {7,3,8};
//     
//    LinkedHashSet<Integer> set = new LinkedHashSet<>();
//    for(int i=0;i<a.length;i++){
//    set.add(a[i]);
//    }
//    for(Integer intr : set){
//    	System.out.println(intr);
//    }
		//++++++++++++++++++++++++++++++++++++++
//		String  s= "this is String";
//		
//				String reverse ="";
//				 String words[]=s.split(" ");  
//				    String reverseWord="";  
//				    for(String w:words){  
//				        StringBuilder sb=new StringBuilder(w);  
//				        sb.reverse();  
//				        reverseWord+=sb.toString()+" ";  
//				    	
//				    }  
//				    System.out.println(reverseWord); 
		//++++++++++++++++++++++++++++++++++++++++++
//		StringJoiner sj = new StringJoiner(":");
//		 sj.add("George").add("Sally").add("Fred");
//		 String desiredString = sj.toString();
//		 System.out.println(desiredString);
	//	++++++++++++++++++++++++++++++++++++
		String PrimeNumbers="";
		for(int i =1;i<=10;i++){
		int	counter = 0;
			for(int j=i;j>=1;j--){
				if(i%j==0){
					counter=counter+1;
				}
			}
			if(counter==2){
				PrimeNumbers = PrimeNumbers +i +" ";
			}
		}
		System.out.println(PrimeNumbers);
	}

}
