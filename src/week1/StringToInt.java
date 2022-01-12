package week1;

public class StringToInt {

    public static void main(String[] args) {

        System.out.println(myAtoi("iufuydhnk- 298 7232"));
        System.out.println(myAtoi("r pdo +   4 556 1kpo"));
        System.out.println(myAtoi("f jow kflkiw 3 rg"));
        System.out.println(myAtoi("-234512"));
        System.out.println(myAtoi("+++rg@$-123+"));
        System.out.println(myAtoi("sgld + wkfkv-"));
        System.out.println(myAtoi("-100000000000"));
        System.out.println(myAtoi("234567 87654321"));

    }

    public static int myAtoi(String s) {

        String numString = "";
        // Iterate through a string to find a number
        for (int i = 0; i < s.length(); i++) {
            // If a digit is met, or
            if (Character.isDigit(s.charAt(i)) ||
                    // ...if '+' or '-' is met and
                    ((s.charAt(i) == '+' || s.charAt(i) == '-')
                            // ...it is not the last symbol in the string and the following symbol is a digit,
                            && i != s.length()-1 && Character.isDigit(s.charAt(i+1)))) {
                // ...then begin recording the number
                numString += s.charAt(i);
                for (int j = i + 1; j < s.length(); j++) {
                    if (Character.isDigit(s.charAt(j))) {
                        numString += s.charAt(j);
                    // Ignore whitespaces
                    } else if (s.charAt(j) == ' ') {
                        continue;
                    // Stop recording when a non-digit character is met
                    } else {
                        break;
                    }
                }
                break;
            }
        }
        // Check if any digits where recorded
        if (!"".equals(numString)) {
            long numLong = Long.parseLong(numString);
            int resultInt;
            // Clamp the integer so that it remains in the range
            if (numLong < Integer.MIN_VALUE) {
                resultInt = Integer.MIN_VALUE;
            } else if (numLong > Integer.MAX_VALUE) {
                resultInt = Integer.MAX_VALUE;
            } else {
                resultInt = (int) numLong;
            }
            return resultInt;
        // Return 0 if no digits where recorded
        } else {
            return 0;
        }
    }
}
