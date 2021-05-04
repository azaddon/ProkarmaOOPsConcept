package stringPackage;

public class ReverseWordPosition {

	public static void main(String[] args) {

		String s = "I Love Java Programming";

		String words[] = s.split(" ");

		String reversedWord = "";

		for (int i = 0; i < words.length; i++) {
			reversedWord = " " + words[i] + reversedWord;
		}
		System.out.println("Reversed Word::::" + reversedWord);
	}

}
