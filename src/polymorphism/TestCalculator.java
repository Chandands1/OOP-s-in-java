package polymorphism;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		
		System.out.println(calculator.add(5, 89));
		System.out.println(calculator.add("ram", "sita"));
		System.out.println(calculator.add(2.4, 5.8));
		
	}

}
