import java.util.Scanner; 

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char cont = 'y'; 
		Scanner scan = new Scanner(System.in); 
		int userNum = 0; 
	while (cont == 'y') {
		System.out.println("Hello! Please enter a number to have its factorial calculated: "); 
		userNum = scan.nextInt(); 
		while (userNum < 1 || userNum >20) { // 20 seems to be the highest number that can be accurately calculated. 
			System.out.println("Sorry, this calculator is limited and can only work with a number between 1 and 20, please enter again: "); 
			userNum = scan.nextInt(); // extra validation to make sure that the user enters a number could have been adding by  taking a string instead of an int, and using a forloop with Character.isDigit() over every character in the string and then parsing the validated string into an int with Integer.parseInt(), but I wanted to keep this one simpler since I had been doing that a lot lately. 
		}
		System.out.println(factorial(userNum)); 
		System.out.println("Would you like to continue? (y/n)"); 
		String answer = scan.next(); 
		cont = Character.toLowerCase(answer.charAt(0)); 
		if (cont == 'n') {
			System.out.println("Thank you for playing!"); 
			scan.close(); 
		}
	}
		
		
		
	}
	
	public static long factorial(int num) {
		long result = 1; 
		if (num == 0) {
			return result; 
		} else {
			return num * factorial(num - 1); 
		}
	}

}
