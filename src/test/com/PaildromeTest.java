package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PaildromeTest
{
    // To check sentence is palindrome or not
    static boolean sentencePalindrome(String inputString) {
        int start = 0;
        int end = inputString.length()-1;

        // Lowercase string
        inputString = inputString.toLowerCase();

        // Compares character until they are equal
        while(start <= end) {

            char getCharS = inputString.charAt(start);
            System.out.println("Left Char " + getCharS);
            char getCharE = inputString.charAt(end);
            System.out.println("Right Char " + getCharE);
            // If there is another symbol in left of sentence
            if (!(getCharS >= 'a' && getCharS <= 'z'))
            	start++;

            // If there is another symbol in right of sentence
            else if(!(getCharE >= 'a' && getCharE <= 'z'))
            	end--;

            // If characters are equal
            else if( getCharS == getCharE)
            {
            	start++;
            	end--;
            }

            // If characters are not equal then sentence is not palindrome
            else
                return false;
        }

        // Returns true if sentence is palindrome
        return true;
    }

    // Driver program to test sentencePallindrome()
    public static void main(String[] args)
    {
    	BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try{
          System.out.print("Enter a sentence: ");
          String inputString = dataIn.readLine();
          if( sentencePalindrome(inputString)) {
              System.out.println(inputString + " is palindrome");
          } else {
              System.out.println(inputString + " is not palindrome");
          }
        }catch(IOException e){
          e.printStackTrace();
          System.err.println(e);
        }
    }
}