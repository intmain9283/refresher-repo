public class Counting{

	//Function to count to 10
	public void CountTo10() {
		for (int i = 0; i < 10; i++) {
			System.out.printf("Number: %d", i+1);
		}
	}
	
	//Function to count to 100
	public void CountTo100() {
		for (int i = 0; i < 100; i++) {
			System.out.printf("Number %d", i+1);
		}
	}
	
	//Function to count by 5
	public CountBy5() {
		for (int i = 0; i < 100; i=+5) {
			System.out.printf("Number: %d", i);
		}
	}

	//Main method
	public static void main (String[] args) {
		for (int i = 0; i < 1000; i=+10) {
			System.out.printf("Number: %d", i);
		}
	}	
}