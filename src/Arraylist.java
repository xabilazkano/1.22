import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		
		while (flag==0) {
		
		System.out.println("Choose what exercise do you want me to do between 1 and 7 (0 to quit): ");
		System.out.println("1 Given a positive number tells how many even digits has the number");
		System.out.println("2 Given a positive number and a digit tells whether the digit appears in the number or not and in case yes, how many times it does");
		System.out.println("3 Given a positive number it gives us the inverted number");
		System.out.println("4 Given a binary number it gives us its decimal value");
		System.out.println("5 Given a sentence and a letter it gives the number of words of the sentence that begin with that letter");
		System.out.println("6 Given a sentence and a letter it gives the number of words of the sentence that end with that letter");
		System.out.println("7 Given a word it tells the user whether the word is a palindrome or it is not");
		int a = sc.nextInt();
		
		switch (a) {
		
		case 0:
			System.out.println("Good bye!");
			flag=1;
			break;
		case 1: 
			
			System.out.println("Enter a positive number and I will tell you how many even numbers has:");
			
			String num = sc.next();
			
			int number = Integer.parseInt(num);
			if (number>0) {
			List<Character> digit = new ArrayList<>();
			for (int i=0;i<num.length();i++) {
    			digit.add(num.charAt(i));
    		}
			
			int counter=0;
			for (int i=0;i<num.length();i++) {
				if (digit.get(i)%2==0) {
					counter++;
				}
			}
			
				System.out.println("The number " + num + " has "+counter+" even numbers");
				System.out.println();	
			
			}
			break;
			
		case 2:
			System.out.println("Please, enter a positive number");
        	boolean finished2=false;
        	while (finished2==false) {
        		// Check that the user enters a number
        		if (sc.hasNextInt()) {
        			// Create a string object with the number's value
        			String usernumber = sc.next();
        			// Pass the value to an int variable
		        	 number = Integer.parseInt(usernumber);
		        	// Check that the number is positive
		        	if (number>0) {
		        		System.out.println("Please, enter a digit");
		        		// Check that the user enters a number
			        	if (sc.hasNextInt()) {
							// Create a string object with the number's value
			        		String digit = sc.next();
			        		// Pass the value to an int variable
			        		int number2 = Integer.parseInt(digit);
			        		// Check that the number is positive
				        	if (number2>0) {
				        		// Check that the number is a digit
					        	if (digit.length()==1) {
					        		// Create an array with the digit's value
					        		char charDigit = digit.charAt(0);
					        		// Create an array with the previous number's digits
					        		List<Character> digits = new ArrayList<>();
					    			for (int i=0;i<usernumber.length();i++) {
					        			digits.add(usernumber.charAt(i));
					        		}
						       
						        	int counter = 0;
						        	for (int i=0;i<usernumber.length();i++) {
						        		
						        		if (charDigit==digits.get(i)){
						        			counter++;
						        		}
						        	}
						        	System.out.println("This digit appears "+ counter + " times in that number.");
						        	// Get out of the loop
					        		finished2=true;
					        	}
					        	else {
					        		System.out.println("That is not a digit, enter the previous number again");
					        	}
				        	}
				        	else {
				        		System.out.println("That is not a digit, enter the previous number again");
				        	}
			        	}
			        	else {
			        		System.out.println("That is not a digit, enter the previous number again");
			        		// Jump the token '/n'
			        		sc.nextLine();
			        	}
		        	}
		        	else {
		        		System.out.println("That is not a positive number, try it again");
		        	}
        		}
        		else {
        			System.out.println("That is not a positive number, try it again");
        			// Jump the token '/n'
        			sc.nextLine();
        		}
        	}
            break;
            case 3:
            	System.out.println("Please, enter a positive number");
    			// Open a loop
	        	boolean finished3=false;
	        	while (finished3==false) {
	        		// Check that the user enters a number
	        		if (sc.hasNextInt()) {
	        			// Create a string object with the number's value
	        			String usernumber = sc.next();
						// Jump the token '/n'
						sc.nextLine();
	        			// Pass the value to an int variable
			        	int chk = Integer.parseInt(usernumber);
			        	// Check that the number is positive
			        	if (chk>0) {
			        		// Print the inverted number
			        		for (int index=usernumber.length()-1;index>=0;index--) {
			        			System.out.print(usernumber.charAt(index));
			        		}
			        		System.out.print("\n");
			        		// Get out of the loop
			        		finished3 = true;
			        	}
			        	else {
			        		System.out.println("That is not a positive number, try it again");
			        	}
	        		}
	        		else {
	        			System.out.println("That is not a positive number, try it again");
	        			// Jump the token '/n'
	        			sc.nextLine();
	        			
	        		}
	        	}
	            break;
		
		case 4:  
			int flag4 = 0;
			while (flag4==0) {
			System.out.println("Enter a binary value and I will return you the decimal");
				if (sc.hasNextInt()) { //we control that we insert a number
					String bi = sc.next();
					
					List<Character> digits = new ArrayList<>();
	    			for (int i=0;i<bi.length();i++) {
	        			digits.add(bi.charAt(i));
	        		}
					int counter4=0;
					for (int i=0;i<bi.length();i++) { //we control that all the digits are 0 or 1
						if (digits.get(i)!='1' && digits.get(i)!='0') {
							counter4=1;
						}
					}
					if (counter4==0) {
						int decimal = Integer.parseInt(bi,2); //with this method we pass a binary number to a decimal
						System.out.println("Your binary number was "+bi+" and the decimal is "+decimal);
						flag4++;
					}
					else {
						System.out.println("You haven't entered a binary number");
					}
				}
				else {
				System.out.println("You haven't entered a binary number, try it again");
				String tokenjump = sc.next(); 
				}
			}
			break;
		    
		case 5:
		    int flag5 = 0;
		    while (flag5==0) {
		    	System.out.println("Give me a sentence");
		    	String jump = sc.nextLine(); //we jump the line of the menu
		    	String sentence= sc.nextLine();  //we save the line
		    	System.out.println("Give me a letter");
		    	String letter = sc.next();
		    	if (letter.length()==1) { //we control that we have entered a digit
		    		String[] array = sentence.split(" "); //we separate the words of the sentence
		    		int count=0;
		    		for (int i=0;i<array.length;i++) { 
		    			if (array[i].charAt(0)==letter.charAt(0)) {
		    				count++;
		    			}	
		    		}
		    		System.out.println(count + " words of your sentence start with "+ letter);
		    		flag5++;
		    	}
		    	else {
				System.out.println("You haven't entered a letter");
		    	}
		    }
			break;
		    
			
		case 6:
			
			int flag6 = 0;
			while (flag6==0) {
				System.out.println("Give me a sentence");
				String jump = sc.nextLine(); //we jump the line of the menu
				String sentence = sc.nextLine(); //we save the line
				System.out.println("Give me a letter");
				String letter = sc.next();
				if (letter.length()==1) { //we control that we have entered a digit
					String[] hitz = sentence.split(" "); //we separate the words of the sentence
					int kont=0;
			
					for (int i=0;i<hitz.length;i++) {
						int lu = hitz[i].length(); //we save the length of the word to use the last letter
						if (hitz[i].charAt(lu-1)==letter.charAt(0)) { //we compare the last letter from each word with our letter
							kont++;
						}
					}
					System.out.println(kont + " words of your sentence finish with "+ letter);
					flag6++;
				}
				else {
				System.out.println("You haven't entered a letter");
				}
			}
			break;
		   
		case 7:
			System.out.println("Give me a word");
			String hitza = sc.next();
			char[] letrak = hitza.toCharArray(); //we save the letters in a char array
			String alderantziz="";
			for (int i=hitza.length()-1;i>=0;i--) { //we read the letters in the inverted way
				alderantziz=alderantziz+letrak[i]; //we save the inverted word
			}
			
			if (hitza.equals(alderantziz)){ //we use this method to compare two strings
				System.out.println("The word is a palindrome");
			}
			else {
				System.out.println("The word is not a palindrome");
			}
		break;
		}
		}

	}

}