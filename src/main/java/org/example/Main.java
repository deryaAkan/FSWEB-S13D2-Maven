package org.example;

public class Main {

    public static void main(String[] args) {
        int number = -1221;
        isPalindrome(number);
        isPerfectNumber(number);
        numberToWords(number);

    }
    public static boolean isPalindrome(int number) {
        String numString =String.valueOf(Math.abs(number));;
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
            String text = "";
            for (char i : digits) {
                switch (i) {
                    case '0' :
                        text = text + "Zero ";
                        break;
                    case '1' :
                        text = text + "One ";
                        break;
                    case '2' :
                        text = text + "Two ";
                        break;
                    case '3' :
                        text = text + "Three ";
                        break;
                    case '4' :
                        text = text + "Four ";
                        break;
                    case '5':
                        text = text + "Five ";
                        break;
                    case '6':
                        text = text + "Six ";
                        break;
                    case '7':
                        text = text + "Seven ";
                        break;
                    case '8' :
                        text = text + "Eight ";
                        break;
                    case '9' :
                        text = text + "Nine ";
                        break;
                    default:
                        break;

                }
            }

            System.out.println(text.trim());
            return  text.trim();

        }
    }
}