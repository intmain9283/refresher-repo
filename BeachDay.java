public class BeachDay {
	public static void main (String[] args) {
		double rain = Math.floor(Math.random() * 10);
		
		if (rain <= 4) {
			System.out.printf("It is raining outside.  No beach day");
		}
		else{
			System.out.printf("It is not raining outside. Beach day!");
		}
	}
}




