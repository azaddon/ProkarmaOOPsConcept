package stringPackage;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I love java Programming";
		String word[] = s.split(" ");
		String reversedString = "";
		for (int j = 0; j < word.length; j++) {
			String words = word[j];
			String reverseWord = "";
			for (int i = words.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + words.charAt(i);
			}
			reversedString = reversedString + reverseWord + " ";
		}
		System.out.println("Reversed String :::::" + reversedString);
	}

}
