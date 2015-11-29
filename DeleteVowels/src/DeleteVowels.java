import java.util.ArrayList;
import java.util.Scanner;

public class DeleteVowels {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		char[] vowelsArray = new char[]{'a', 'e', 'i', 'o', 'u'};
		ArrayList<Character> vowelList = new ArrayList<Character>();
		for (char vowel : vowelsArray) {
			vowelList.add(vowel);
		}
		System.out.println("Enter a string: ");
		String inputString = in.next();
		StringBuffer str = new StringBuffer(inputString);
		for (int i = 0; i < str.length(); i++) {
			if (vowelList.contains(str.charAt(i))) {
				str.deleteCharAt(i);
			}
		}
		System.out.println("String without vowels: " + str);
	}
	
}
