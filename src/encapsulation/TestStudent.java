package encapsulation;

public class TestStudent {
	
	public static void main(String[] args) {
		Student student = new Student();
		
		student.setName("Chandan");
		student.setRollNumber(27);
		student.setMarks(84);
		
		System.out.println("Name: " + student.getName());
		System.out.println("Roll Number "+ student.getRollNumber());
		System.out.println("Marks "+ student.getMarks());
	}

}
