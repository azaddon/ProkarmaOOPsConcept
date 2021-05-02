package stringPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class CountSimilarWord {

	public static void main(String[] args) {
		
		String Paragraph ="My name is Azad Khan.Azad is nice boy.Azad visited so many places.Azad is working now in Prokarma.";
		
		ArrayList<String> ls = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(Paragraph, " .", true);
		while(st.hasMoreTokens()){
			ls.add(st.nextToken());
		}
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String s:ls){
			if(map.containsKey(s)){
				map.put(s, map.get(s)+1);
				
			}else{
				map.put(s, 1);
			}
		}
		for(Map.Entry entry : map.entrySet()){
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

}
