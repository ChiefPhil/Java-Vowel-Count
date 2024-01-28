package philip;

import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
     // The line above displays a message asking the user to enter a sentence.
        String input = scanner.nextLine();
     // This line reads the text from the user and stores it in the input variable.

        int vowelCount = countVowels(input);
     // This line calls the countVowels method with the user input and stores the result in the vowelCount variable.
        int wordCount = countWords(input);

        System.out.println("Number of vowels: " + vowelCount);
        //This line displays the number of vowels from the text @line 8 which was counted.
        System.out.println("Number of words: " + wordCount);
       // This line displays the number of word also from the text @line 8 which was counted.
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
      //  This line declares a string vowels containing all lowercase and uppercase vowels.

        for (int i = 0; i < str.length(); i++) { //This line starts a for loop that iterates through each character in the input string.
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) {  
                count++;
              //This line checks if the current character is a vowel by looking for its index in the vowels string. 
                //If the index is not -1, it means the character is a vowel.
               // and counts it
            }
        }
        return count; //this marks the end of the "for" loop @ line 28. it returns the final count of vowels in the inout string.
    }

    public static int countWords(String str) { //This line declares the countWords method that takes a String parameter (str) and returns an integer.
        String[] words = str.split("\\s+");
        //This line splits the input string into an array of words.
        return words.length;
        //This line returns the length of the array, which represents the number of words in the input string.
    }
}