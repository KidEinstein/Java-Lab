import java.util.Scanner;


public class ArrayProgram {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		System.out.println("Enter 5 number: ");
		
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextInt();
		}
		in.close();
		
		System.out.println("Array elements: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		System.out.println("Incrementing by 1");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]++;
		}
		
		System.out.println("New values");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		System.out.println("Last 5 values");
		for (int i = numbers.length - 5; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println();
		System.out.println("Sum: " + sum);
		
		int avg = sum / numbers.length;
		System.out.println("Average: " + avg);
		
	}
}
