import java.util.Scanner;

class LongestPrefixExample {
    public static String longestPrefix(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                result.append(str1.charAt(i));
            } else {
                break;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str1 = "pdftkl";
        String str2 = "pdftmkl";
        System.out.println(longestPrefix(str1, str2)); // Output: pdft
    }
}

public class LastWordLengthExample {
    public static int lastWordLength(String str) {
        String[] words = str.split("\\s+");

        if (words.length == 0) {
            return 0;
        } else {
            return words[words.length - 1].length();
        }
    }

    public static void main(String[] args) {
        String str = "Hello, I'm George";
        System.out.println(lastWordLength(str)); // Output: 6
    }
}



 class PalindromeExample {


    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }

        return true;
    }

    public static void main(String[] args) {
        String palindromeStr = "A man, a plan, a canal, Panama!";
        System.out.println(isPalindrome(palindromeStr)); // Output: true
    }
}


 class ChangeCaseExample {
    public static String changeCase(String str) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "Hello I am Giorgi";
        System.out.println(changeCase(str)); // Output: hELLO i AM gIORGI
    }
}

