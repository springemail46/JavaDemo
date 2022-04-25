package main.java;

public class Test {
    public static void main(String[] args) {

        String str = "abcdcba";
        if(checkPalindrom(str)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
    static boolean checkPalindrom(String str){
        boolean b = true;
        for(int i = str.length()-1; i>= 0; i--){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return b;
    }
}