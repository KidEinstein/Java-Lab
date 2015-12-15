
public class StringOperations {
	public static String frontBack(String string) {
		StringBuilder sb = new StringBuilder(string);
		char temp = sb.charAt(0);
		sb.setCharAt(0, sb.charAt(sb.length() - 1));
		sb.setCharAt(sb.length() - 1, temp);
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(frontBack("apple"));
	}

}
