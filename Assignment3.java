
// AUTHOR: Brandon Lequang
// SPECIFICATION: Program asks a user to enter two strings, and based on the options listed to the user, will perform a certain action with the two strings inputted

// import Scanner object
import java.util.Scanner;


// class name should match file name
public class Assignment3 {
	
	
	// main method to run program
	public static void main(String [] args) {
		
		
		// create Scanner object to get input from keyboard
		Scanner input = new Scanner(System.in);
		
		
		// create char option for letter options
		char option;
		
		
		// print "Please enter a string" and string input to nextLine
		System.out.println("Please enter a string.");
		String s1 = input.nextLine(); 
		
		
		// print "Please enter another string" and string input to nextLine
		System.out.println("Please enter another string.");
		String s2 = input.nextLine();
		
		
		// print "Command Options:"  and options "a-f, q"
		System.out.println("Command Options:");
		System.out.println("Option a: checks if the length of the two strings are the same.");
	    System.out.println("Option b: checks if two strings are same or different.");
	    System.out.println("Option c: checks which string is lexically larger, or if they are same");
	    System.out.println("Option d: prints out the first character (index 0) of each string");	        
	    System.out.println("Option e: prints out a new string consisting of the first string concatenated (appended) with the second string.");
	    System.out.println("Option f: prints out two strings using upper case letters.");
	    System.out.println("Option q: quit the program.");
	    
	    
	    // complete action based on the option that is chosen
	    do {
	    	System.out.println("Please, enter an option from the menu.");
	    	option = input.nextLine().charAt(0);
	    	
	    // switch statement for all options
	    	switch (option) {
	    	
	    	
	    	// Option a: checks if the length of the two strings are the same. Prints result
	    	case 'a':
                System.out.println("Two String Lengths are " + (s1.length() == s2.length() ? "same" : "different"));
                break;
                
                
            // Option b: checks if two strings are same or different. Prints result
            case 'b':
                System.out.println("Two strings are " + (s1.equals(s2) ? "same" : "different"));
                break;
                
                
            // Option c: checks which string is lexically larger, or if they are same. If-else statement, Prints result
            case 'c':
                int value = s1.compareTo(s2);
                if (value == 0)
                    System.out.println("Two strings are Lexically same.");
                else if (value > 0)
                    System.out.println(s1 + " is lexically larger");
                else
                    System.out.println(s2 + " is lexically larger");
                break;
            
                
            // Option d: prints out the first character (index 0) of each string. Prints result
            case 'd':
                System.out.println("First characters :");
                System.out.println(s1.charAt(0) + "  " + s2.charAt(0));
                break;
                
            
            // Option e: prints out a new string consisting of the first string concatenated (appended) with the second string. Prints result
            case 'e':
                String newString = s1.concat(s2);
                System.out.println(newString);
                break;
            
                
            // Option f: prints out two strings using upper case letters. Prints result 
            case 'f':
                System.out.println("Upper case of s1:" + s1.toUpperCase());
                System.out.println("Upper case of s2:" + s2.toUpperCase());
                break;
                
            
            // Option q: Goodbye! Prints result and ends program
            case 'q':
                System.out.println("Goodbye!");
                break;
                
                
            // Defaults and prints invalid if any characters used are not a-f, or q
            default:
                System.out.println("Invalid option.");
                
        }
    }
	    while (option != 'q'); //ends program
	    input.close(); // closes input Scanner
	    }//end Main method
	}//end Assignment