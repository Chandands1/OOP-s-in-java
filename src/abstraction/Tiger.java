package abstraction;

public class Tiger implements Animal{

	@Override
	public void eat() {
		System.out.println("Tiger eats meat");
		
	}

	@Override
	public void sleep() {
		System.out.println("Tiger sleeps in the jungle");
		
	}

}
