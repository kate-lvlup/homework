import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameApp gameApp = new GameApp();
        gameApp.runGameApp();
        MethodCheck methodCheck = new MethodCheck();
        methodCheck.validatePalindrome();
        methodCheck.getSymbol();
        methodCheck.containString();
        methodCheck.containEndString();
        methodCheck.lengthString();
        methodCheck.replaceString();
        methodCheck.repeatSymbol();
        methodCheck.deleteRepeatSymbol();
    }
}