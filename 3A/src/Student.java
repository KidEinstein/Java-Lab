
public class Student {
	public static void main(String args[]) {
		try {
			int marks1 = Integer.parseInt(args[0]);
			int marks2 = Integer.parseInt(args[1]);
			int marks3 = Integer.parseInt(args[2]);
		
			if (marks1 < 20 || marks2 < 20 || marks3 < 20) {
				throw new MarksEligible("Not eligible");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (MarksEligible e) {
			System.out.println(e.getMessage());
		}
	}
}
