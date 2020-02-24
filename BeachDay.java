public class BeachDay {
/*
	In this function, a random number is generated and is checked in an if-else statement to find out if its a beach day. If the number is less than 4, then it is determined that it's raining and there is no beach day; else it is not raining and determined that it is a beach day
*/
	//Main function
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




