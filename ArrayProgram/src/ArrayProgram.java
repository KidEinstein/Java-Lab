
public class ArrayProgram {
	public static void main(String args[]) {
		int[] newNumbers = new int[]{10, 6, 88, 91, 25, 77, 14, 23 ,4, 235, 66, 81};
		System.out.println("Length: " + newNumbers.length);
		System.out.println("Fifth element: " + newNumbers[4]);
		newNumbers[4] = 35;
		System.out.println("Fifth element: " + newNumbers[4]);
		int sum = 0;
		for (int i = 0; i < newNumbers.length; i++) {
			sum += newNumbers[i];
		}
		int avg = sum / newNumbers.length;
		System.out.println("Average: " + avg);
	}
}
