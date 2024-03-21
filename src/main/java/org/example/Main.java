package org.example;

public class Main {

    public static void main(String[] args) {
        int number = -1221;
        isPalindrome(number);
        isPerfectNumber(number);
        numberToWords(number);

    }
    public static boolean isPalindrome(int number) {
        String numString =String.valueOf(Math.abs(number));
        char[] digits = numString.toCharArray();

        for (int i = 0, j=digits.length-1; i<j ; i++,j--){
            if(digits[i] != digits[j]) {
                System.out.println("Sayı palindrom değil!" + number);
                return  false;
            }
        }
        System.out.println("Sayı palindrom!" + number);
        return true;
    }
    public static boolean isPerfectNumber(int number){
        int sum=0;
        for (int i=1; i<=number/2 ; i++){
            if (number % i == 0) {
                sum=sum+i;
            }

        }
        if (sum == number) {
            System.out.println("Mükemmel sayı!" + number);
            return true;
        }
        else {
            System.out.println("Mükemmel sayı değil!" + number);
            return false;
        }

    }
    public static String numberToWords (int number) {
        if (number < 0) {
            String text = "Invalid Value";
            System.out.println(text);
            return text;
        }
        else {
            String numString =String.valueOf(number);
            char[] digits = numString.toCharArray();
            StringBuilder text = new StringBuilder();
            for (char i : digits) {
                switch (i) {
                    case '0' :
                        text.append("Zero ");
                        break;
                    case '1' :
                        text.append("One ");
                        break;
                    case '2' :
                        text.append("Two ");
                        break;
                    case '3' :
                        text.append("Three ");
                        break;
                    case '4' :
                        text.append("Four ");
                        break;
                    case '5':
                        text.append("Five ");
                        break;
                    case '6':
                        text.append("Six ");
                        break;
                    case '7':
                        text.append("Seven ");
                        break;
                    case '8' :
                        text.append("Eight ");
                        break;
                    case '9' :
                        text.append("Nine ");
                        break;
                    default:
                        break;

                }
            }

            System.out.println(text.toString().trim());
            return  text.toString().trim();

        }
    }
}