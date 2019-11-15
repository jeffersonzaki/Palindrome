//------------------------------------------------------
//      Zaki Jefferson
//      17 Oct 2019
//      CSC 202
//      Project: Palindrome
//      A method that checks if a word is a palindrome. Uses a stack to check
//------------------------------------------------------


package Projects;

import java.util.*;

public class Palindrome {

    /* Main Method */
    public static void main(String[] args) {
        //user input
        Scanner userInput = new Scanner(System.in);

        //Allow user to input as many strings as long as statement is true
        while (true) {
                System.out.print("\nEnter a Palindrome: ");   //user will enter a palindrome
                //getting rid of whitespace and converting all characters to lower case
                String input = userInput.nextLine().replaceAll("\\s+", "").toLowerCase();

                //creating a stack with character
                Stack<Character> stack = new Stack<Character>();

                for (int i = 0; i < input.length(); i++) {
                    stack.push(input.charAt(i));
                }

                String reverseString = "";
                //inverting the string
                while (!stack.isEmpty()) {
                    reverseString = reverseString + stack.pop();
                }
                //Check if the entered String is a palindrome
                if (input.equals(reverseString))
                    System.out.println("This is a palindrome.");
                else
                    System.out.println("\nThis is not a palindrome. Try again");
            }
        }
    }



