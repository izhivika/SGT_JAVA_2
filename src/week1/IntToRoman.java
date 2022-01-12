package week1;

import java.util.HashMap;

public class IntToRoman {

    public static void main(String[] args) {

        System.out.println(intToRoman(4));
        System.out.println(intToRoman(10));
        System.out.println(intToRoman(26));
        System.out.println(intToRoman(101));
        System.out.println(intToRoman(837));
        System.out.println(intToRoman(1078));
        System.out.println(intToRoman(3640));

    }

    public static String intToRoman(int n) {

        HashMap<Integer, String> numerals = new HashMap<>();
        numerals.put(1, "I");
        numerals.put(2, "II");
        numerals.put(3, "III");
        numerals.put(4, "IV");
        numerals.put(5, "V");
        numerals.put(6, "VI");
        numerals.put(7, "VII");
        numerals.put(8, "VIII");
        numerals.put(9, "IX");
        numerals.put(10, "X");
        numerals.put(20, "XX");
        numerals.put(30, "XXX");
        numerals.put(40, "XL");
        numerals.put(50, "L");
        numerals.put(60, "LX");
        numerals.put(70, "LXX");
        numerals.put(80, "LXXX");
        numerals.put(90, "XC");
        numerals.put(100, "C");
        numerals.put(200, "CC");
        numerals.put(300, "CCC");
        numerals.put(400, "CD");
        numerals.put(500, "D");
        numerals.put(600, "DC");
        numerals.put(700, "DCC");
        numerals.put(800, "DCCC");
        numerals.put(900, "CM");
        numerals.put(1000, "M");
        numerals.put(2000, "MM");
        numerals.put(3000, "MMM");

        String roman = "";
        // Converting the integer into a string, so we can iterate through its digits
        String stringInt = Integer.toString(n);
        // Ordinal number
        int k = 0;
        for (int i = stringInt.length()-1; i >= 0; i--) {
            int currDigit = Character.getNumericValue(stringInt.charAt(i));
            if (currDigit != 0) {
                // Adding the needed roman numeral from the hashmap according to the digit's place in the given number
                roman = numerals.get(currDigit * (int) Math.pow(10, k)) + roman;
            }
            k++;
        }
        return roman;
    }
}
