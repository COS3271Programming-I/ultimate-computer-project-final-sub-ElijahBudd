package myProjects;
import java.util.Arrays;
import java.util.Scanner;

public class Ultimate_Computer {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		int choice = -1;
		
		System.out.println("ULTIMATE Computer Menu");
		
		do {
			printMenu();
			choice = getValidChoice(userinput, 0, 9);
			
			switch (choice) {
				case 1 -> displayApp();
	            case 2 -> textArtApp();
	            case 3 -> calculatorApp();
	            case 4 -> binaryCalculatorApp();
	            case 5 -> encouragementApp();
	            case 6 -> diceApp();
	            case 7 -> oppishApp();
	            case 8 -> fibonacciApp();
	            case 9 -> doubleFactorialApp();
	            case 0 -> System.out.println("Succesfully exited the ULTIMATE Computer.");
			}
			
		} while (choice != 0);
		
		userinput.close();
	}
	
	private static void printMenu() {
		System.out.println("------------------------------------------");
		System.out.println("  1. Display App");
        System.out.println("  2. Text Art App");
        System.out.println("  3. Calculator App");
        System.out.println("  4. Binary Calculator App");
        System.out.println("  5. Encouragement App");
        System.out.println("  6. Dice App");
        System.out.println("  7. Oppish App");
        System.out.println("  8. Fibonacci App");
        System.out.println("  9. Double Factorial App");
        System.out.println("  0. Exit");
        System.out.println("------------------------------------------");
        System.out.print("Enter your choice (0-9): ");
	}
	
	private static int getValidChoice(Scanner userinput, int min, int max) {
		while (true) {
			try {
				int input = Integer.parseInt(userinput.nextLine().trim());
				if (input >= min && input <= max) {
					return input;
				}
				System.out.printf("Invalid choice. Please enter a number between %d and %d", min, max);
			} catch (NumberFormatException e) {
				System.out.printf("Invalid input. Please enter a number between %d and %d", min, max);
			}
		}
	}
	
	 	private static void displayApp() {
	        // Week 1 — Display App
	 		
		 	System.out.print("Two things are infinite: the universe and human stupidity;\n"); 
			System.out.format("%50s","and I'm not sure about the universe.\n");
			System.out.println("\t-Albert Einstein");	
	    }
	 
	    private static void textArtApp() {
	    	// Week 2 — Text Art App
	    	
	    	String s;
			s =
			"───────────────────────────────\n"+
			"───────────────████─███────────\n"+
			"──────────────██▒▒▒█▒▒▒█───────\n"+
			"─────────────██▒────────█──────\n"+
			"─────────██████──██─██──█──────\n"+
			"────────██████───██─██──█──────\n"+
			"────────██▒▒▒█──────────███────\n"+
			"────────██▒▒▒▒▒▒───▒──██████───\n"+
			"───────██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒███─\n"+
			"──────██▒▒▒▒─────▒▒▒▒▒▒▒▒▒▒▒▒█─\n"+
			"──────██▒▒▒───────▒▒▒▒▒▒▒█▒█▒██\n"+
			"───────██▒▒───────▒▒▒▒▒▒▒▒▒▒▒▒█\n"+
			"────────██▒▒─────█▒▒▒▒▒▒▒▒▒▒▒▒█\n"+
			"────────███▒▒───██▒▒▒▒▒▒▒▒▒▒▒▒█\n"+
			"─────────███▒▒───█▒▒▒▒▒▒▒▒▒▒▒█─\n"+
			"────────██▀█▒▒────█▒▒▒▒▒▒▒▒██──\n"+
			"──────██▀██▒▒▒────█████████────\n"+
			"────██▀███▒▒▒▒────█▒▒██────────\n"+
			"█████████▒▒▒▒▒█───██──██───────\n"+
			"█▒▒▒▒▒▒█▒▒▒▒▒█────████▒▒█──────\n"+
			"█▒▒▒▒▒▒█▒▒▒▒▒▒█───███▒▒▒█──────\n"+
			"█▒▒▒▒▒▒█▒▒▒▒▒█────█▒▒▒▒▒█──────\n"+
			"██▒▒▒▒▒█▒▒▒▒▒▒█───█▒▒▒███──────\n"+
			"─██▒▒▒▒███████───██████────────\n"+
			"──██▒▒▒▒▒██─────██─────────────\n"+
			"───██▒▒▒██─────██──────────────\n"+
			"────█████─────███──────────────\n"+
			"────█████▄───█████▄────────────\n"+
			"──▄█▓▓▓▓▓█▄─█▓▓▓▓▓█▄───────────\n"+
			"──█▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓█──────────\n"+
			"──█▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓█──────────\n"+
			"──▀████████▀▀███████▀──────────\n";
			System.out.println(s);
	    }
	 
	    private static void calculatorApp() {
	        // Week 3 — Calculator App
	    	
	    	Scanner userinput = new Scanner(System.in);
	    	
	    	double x;
			double y;
			
			System.out.print("Enter a decimal number for x: ");
			x = userinput.nextDouble();
			System.out.print("Enter a decimal number for y: ");
			y = userinput.nextDouble();
			
			Double sum = x + y;
			Double product = x * y;
			Double quotient = x / y;
			Double power = Math.pow(x,  y);
			Double logBase = Math.log(x) / Math.log(y);
			
			System.out.println("Results");
			System.out.println("x + y = " + sum);
			System.out.println("x * y = " + product);
			System.out.println("x / y = " + quotient);
			System.out.println("x^y = " + power);
			System.out.println("log y (x) = " + logBase);
	    }
	 
	    private static void binaryCalculatorApp() {
	        // Week 3 — Binary Calculator App
	    	
	    	Scanner userinput = new Scanner(System.in);
	       
	    	System.out.print("Enter a binary number for x: ");
			String x = userinput.nextLine();
			System.out.print("Enter a binary number for y: ");
			String y = userinput.nextLine();
			
			System.out.println("Results");
			System.out.println("x + y: " + Integer.toBinaryString(Integer.parseInt(x,2) + Integer.parseInt(y,2)));
			System.out.println("x - y: " + Integer.toBinaryString(Integer.parseInt(x,2) - Integer.parseInt(y,2)));
			System.out.println("x * y: " + Integer.toBinaryString(Integer.parseInt(x,2) * Integer.parseInt(y,2)));
			System.out.println("x / y: " + Integer.toBinaryString(Integer.parseInt(x,2) / Integer.parseInt(y,2)));
	    }
	 
	    private static void encouragementApp() {
	    	// Week 4 — Encouragement App
	    	
	    	Scanner userinput = new Scanner(System.in);
	    	System.out.print("How old are you? ");
			Integer age = userinput.nextInt();
			userinput.nextLine();
			System.out.print("How are you doing today? ");
			String mood = userinput.nextLine().toLowerCase();
			
			if (age < 13 && mood.contains("good")) {
				System.out.println("Great! You are young, have fun and make memories.");
			}
			else if (age < 13 && mood.contains("bad")) {
				System.out.println("Sorry to hear that, maybe tomorrow will be better.");
			}
			else if (age >= 13 && age <= 18 && mood.contains("good")) {
				System.out.println("Great! This is the start of your future, chase your dreams.");
			}
			else if (age >= 13 && age <= 18 && mood.contains("bad")) {
				System.out.println("I'm sorry, I hope you have a good rest of your day.");
			}
			else if (age > 18 && mood.contains("good")) {
				System.out.println("Awesome! Make sure to keep a good balance in life.");
			}
			else if (age > 18 && mood.contains("bad")) {
				System.out.println("Sorry about that, maybe try something that you used to like to cheer yourself up.");
			}
			else {
				System.out.println("Always remember to never take the things in life for granted.");
			}	    
		}
	 
	    private static void diceApp() {
	        // Week 5 — Dice App
	    	
	    	Scanner userinput = new Scanner(System.in);
	        
	    	String choice = "y";
			
			while(choice.equalsIgnoreCase("y")) {
				
				System.out.print("Enter (roll) to roll the dice: ");
				String userRoll = userinput.nextLine();
				
				if(userRoll.equalsIgnoreCase("roll")) {
					int die1 = (int)(Math.random() * 6) + 1;
					int die2 = (int)(Math.random() * 6) + 1;
					
					int sum = die1 + die2;
					
					System.out.println("Die 1: " + die1);
					System.out.println("Die 2: " + die2);
					System.out.println(sum);
				}
				else {
					System.out.println("Try again");
				}
				
				System.out.print("Roll again? (y/n): ");
				choice = userinput.nextLine();
			}

	    }
	 
	    private static void oppishApp() {
	    	// Week 6 — Oppish App
	    	
	    	Scanner userinput = new Scanner(System.in);
	    	System.out.print("Enter a sentence: ");
	    	String sentence = userinput.nextLine();
	    	StringBuilder result = new StringBuilder();
	    	
	    	for (int i = 0; i < sentence.length(); i++) {
	    		
	    		char character = sentence.charAt(i);
	    		char lower = Character.toLowerCase(character);
	    		
	    		result.append(character);
	    		
	    		if (isConsonant(lower)) {
	    			if (i == sentence.length() - 1 ||
	    				!isConsonant(Character.toLowerCase(sentence.charAt(i + 1)))) {
	    				
	    				result.append("opp");
	    			}
	    		}
	    	}
	    		
	    		System.out.println(result.toString());
	    }
	    	
	    	public static boolean isConsonant(char character) {
	    		return Character.isLetter(character) &&
	    				"aeiouy".indexOf(character) == -1;
	    	}
	 
	    private static void fibonacciApp() {
	        // Week 7 — Fibonacci App
	        
	    	Scanner userinput = new Scanner(System.in);
	    	
	    	// Ask how many numbers
	        System.out.print("How many Fibonacci numbers would you like (between 1 and 32)? ");
	        int number = userinput.nextInt();
	        
	        if (number < 1 || number > 32) {
	        	System.out.println("Incorrect number try again!");
	        	return;
	        }
	        
	        // Create array
	        int[] fib = new int[number];
	        
	        // Fill array
	        if (number >= 1) fib[0] = 1;
	        if (number >= 2) fib[1] = 1;
	        
	        for (int i = 2; i < number; i++) {
	        	fib[i] = fib[i - 1] + fib[i - 2];
	        }
	        
	        // Print
	        System.out.println("Fibonacci sequence:");
	        for (int i = 0; i < number; i++) {
	        	System.out.print(fib[i] + " ");
	        }
	    }
	 
	    private static void doubleFactorialApp() {
	        // Week 11 — Double Factorial App
	        
	    	Double_Factorial.main(null);
	    }
}
