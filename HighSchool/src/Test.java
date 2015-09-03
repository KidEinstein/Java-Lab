
public class Test {

	public static void main(String[] args) {
		Person anirudh = new Person("Anirudh", 19, "Male");
		System.out.println(anirudh);
		
		Student s1 = new Student("Anirudh", 19, "Male", "CS1234", 4.9);
		System.out.println(s1);
		
		Teacher t1 = new Teacher("Java", 35, "Male", "Computer Science", 50000);
		System.out.println(t1);
		
		CollegeStudent cs1 = new CollegeStudent("Anirudh", 19, "Male", "CS137", 4.8, 2017, "Computer Science");
		System.out.println(cs1);

	}

}
