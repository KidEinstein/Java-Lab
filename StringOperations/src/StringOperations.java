
public class StringOperations {
	public static void main(String args[]) {
		String name = new String("anirudh");
		System.out.println(name);
		System.out.println("Storing first three characters in a character array");
		char[] nameCharArray = new char[10];
		name.getChars(0, 3, nameCharArray, 0);
		System.out.println(nameCharArray);
		String newName = name.replace('a', 'b');
		System.out.println("Replacing a's with b's");
		System.out.println(newName);
		System.out.print("4th Character: ");
		System.out.println(name.charAt(3));
		String sameName = new String(name);
		if (sameName.equals(name)) {
			System.out.println("Same value");
		}
		else {
			System.out.println("Different value");
		}
		if (sameName == name) {
			System.out.println("Same object");
		}
		else {
			System.out.println("Different object");
		}
	}
}