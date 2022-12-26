import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameApp gameApp = new GameApp();
        gameApp.runGameApp();
        Palindrome palindrome = new Palindrome();
        palindrome.validatePalindrome();
        palindrome.getSymbol();
        palindrome.containString();
        palindrome.containEndString();
        palindrome.lengthString();
        palindrome.replaceString();
        palindrome.repeatSymbol();
        palindrome.deleteRepeatSymbol();
    }
}