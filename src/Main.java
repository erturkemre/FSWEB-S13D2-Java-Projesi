import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        isPalindrome(121);
        isPalindrome(11212);

        isPerfectNumber(6);
        isPerfectNumber(28);
        isPerfectNumber(5);
        isPerfectNumber(-1);

        numberToWords(123);
        numberToWords(1010);
        numberToWords(-12);
    }

    public static boolean isPalindrome(int num) {
        String number = String.valueOf(num);
        String ref = "";
        for(int i=number.length()-1;i>=0;i--){
            ref = ref + number.charAt(i);
        }
        if(number.equals(ref)){
            System.out.println("true");
            return true;

        }
        System.out.println("false");
        return false;
    }


    public static boolean isPerfectNumber(int num) {
        int result=0;
        for(int i=1; i<num;i++){
            if(num % i==0){
                result += i;
                if(num == result){
                    System.out.println("true");
                    return true;

                }
            }
        }
        System.out.println("false");
        return false;
    }

    public static String numberToWords(int num) {
        if(num>0){
            String numString = String.valueOf(num);
            String words = "";
            HashMap<Character, String> nums = new HashMap<>();
            nums.put('1', "one");
            nums.put('2', "two");
            nums.put('3', "three");
            nums.put('4', "four");
            nums.put('5', "five");
            nums.put('6', "six");
            nums.put('7', "seven");
            nums.put('8', "eight");
            nums.put('9', "nine");
            nums.put('0', "zero");

            for (int i = 0; i < numString.length(); i++) {
                char digit = numString.charAt(i);
                words += nums.get(digit) + " ";
            }
            System.out.println(words);
            return words;
        }else{
            System.out.println("invalid Value");
            return "invalid value";
        }
    }
}