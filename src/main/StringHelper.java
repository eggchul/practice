package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * A class that contains several methods for manipulating strings
 */
public class StringHelper {

    /**
     * Returns the number of vowels (letters a, e, i, o, u)
     * in a given string.
     *
     * @param message
     * @return the number of vowels
     */
    public static int countVowels(String message) {

        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            String letter = message.substring(i, i + 1);
            if ("a".equalsIgnoreCase(letter) || "e".equalsIgnoreCase(letter)
                    || "i".equalsIgnoreCase(letter) || "o".equalsIgnoreCase(letter)
                    || "u".equalsIgnoreCase(letter)) {
                count += 1;
            }
        }
        return count;
    }

    /**
     * Returns the message encrypted using "Ceasar cipher"
     * with the given shift amount.
     * <p>
     * If the shift is greater than 26 the method returns null.
     * If the message contains any characters that are not upper
     * or lower case letters the method returns null.
     * <p>
     * Example: (abc, 2) -> cde
     * 'a' was shifted by two characters (became 'c'),
     * 'b' became 'd', 'c' became 'e'.
     *
     * @param message
     * @param shift
     * @return
     * @author Prof. Rollins
     */
    public static String encrypt(String message, int shift) {

        String output = "";

        if(shift>26){
            output = null;

        }else{
            if( message.matches("[a-zA-Z]+")){
                for(int i =0; i<message.length();i++){
                    int tmp = message.charAt(i);
                    char result = (char)(shift+tmp);
                    output += result;

                }
            }else{
                output = null;

            }
        }

            return output;
    }

    /**
     * Main method: runs methods of class StringHelper
     */
    public static void main(String[] args) {
        String s = "hello";
        System.out.println("Original string: " + s);
        System.out.println("Number of vowels: " + StringHelper.countVowels(s));
        System.out.println("After encrypting: " + StringHelper.encrypt(s, 3));
    }

}
