/**
 * Description Partner Lab 2 that is a program to test different word and String operations.
 * @author James Rohr {methods written: isPalindrome, isAbecedarian}
 * Partner { Z Wang } {methods written: isPangram, capitalizeFirstLetter}
 *
 * @since 3-18-2025
 */

public class Antics {

    /**
     * Description A method called isPalindrome that takes a string and returns true if it is a palindrome. Make sure to ignore case when checking.
     * A word is said to be a “palindrome” if it reads the same backward as forward
     * @param s will be the string that is passed for testing
     * @return boolean value if string is a palindrome or not
     * Examples: Abba, Anna, civid, kayak, level, noon, racecar, radar, refer, rotator
     */
    public static boolean isPalindrome(String s){
        //make string all lowercase to compare
        s = s.toLowerCase();
        String str = "";
        //run through string to see if the reversed string equals the original string thus making it a palindrome
        for (int i = s.length() - 1; i >= 0; i--) {
            str = str + s.charAt(i);
        }
        return s.equals(str);
        //This will always be true if the string is a palindrome since the norm and reverse of the string are equal
        }


    /**
     * method isAbecedarian
     * Description A method called isAbecedarian that takes a string and returns true if it is a abecedarian. Make sure to ignore case when checking.
     * @param s
     * @return boolean value either abecedarian or not
     * Examples: A word is abecedarian if its letters are arranged in alphabetically
     * accent, access, almost, below, biopsy
     */
    public static boolean isAbecedarian(String s){

        // make the string check if its empty since that would also count as abecedarian

        if (s.isEmpty() || s == null) {
            return true;
            }
        // since the string is not empty next check in a loop each char numeric to be true
        // if its value from the prior is less otherwise return false

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
        }

    /**
     * @author Z Wang
     * method isPangram
     * @param s
     * @return boolean whether string has all 26 alphabet letters or not
     * A method called isPangram that takes a string and returns true if it contains all 26 letters of the alphabet
     * Example: The quick brown fox jumps over the lazy dog.
     */
    public static boolean isPangram(String s) {

        //Array for the checking of each character
        boolean[] alphabetCheck = new boolean[26];
        int index = 0;
        // put the string into lower case since we are only checking a-z
        s = s.toLowerCase();
        //Loop for the entire string length to check each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('a' <= c && c <= 'z') {
                index = c - 'a';
                alphabetCheck[index] = true;
            }
        }
        // Return false if not all items are covered in the array
        for (int i = 0; i < 26; i++) {
            if (!alphabetCheck[i])
                return false;
        }
        return true;
    }


    /**
     * @author Z Wang
     * method capitalizeFirstLetter
     * A method called capitalizeFirstLetter that takes a string and returns the same string with its first letter (only) capitalized
     * Example: california -> California
     */
    public static boolean capitalizeFirstLetter(String s){
        //Check to see if string is empty first
            if (s.isEmpty() || s == null) {
                return false;
            }
            //If string is not empty then return the string with first letter of string in upper case
            return Character.isUpperCase(s.charAt(0));
        }
    }

