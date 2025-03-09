/**
 * Description Partner Lab 2 that is a program to test different word and String operations.
 * @author James Rohr {methods written: isPalindrome, isAbecedarian}
 * Partner Z Wang {methods written: isPangram, capitalizeFirstLetter}
 *
 * @since 3-06-2025
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



        //declare and initialize variabe counts
        //"counts" repersent how many alphabet letter appears in
        //the param String s
        int counts = 0;

        //create a loop to check for
        //all 26 alphabet letters that
        //appears in s
        for(int i = 0; i <26; i++)
        {
            //if find a index of letter ('a' + i) in String s
            //                          ^
            //                          this range covers all alphabet letters
            //                          from 'a'(97) to 'z'(97 + 26)
            if(s.indexOf('a'+ i))
            {
                //add 1 to counts, indicates that
                //1 alphabet letter has appeared in
                //String s.
                counts++;
            }
        }

        //retun if all 26 letters has appeared in String s
        return counts == 26;
    }


    /**
     * @author Z Wang
     * method capitalizeFirstLetter
     * A method called capitalizeFirstLetter that takes a string and returns the same string with its first letter (only) capitalized
     * Example: california -> California
     */
    public static String capitalizeFirstLetter(String s){





        //return the combination String of
        //      String s's first letter in lowercase
        //                      and
        //      rest of the String s
        return s.substring(0,1).toLowerCase() + s.substring(1,s.length());
    }



}

