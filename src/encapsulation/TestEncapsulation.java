package encapsulation;

public class TestEncapsulation {
	
	public static void main(String[] args) {
	    Person person = new Person();
	    person.setName("jhon");
	    person.setAge(23);
	    
	    System.out.println("Name: "+ person.getName());
	    System.out.println("Age: "+ person.getAge());
	    
	    
	}

}
