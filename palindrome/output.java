import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Enter String: ");

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        
        char [] ch = str.toCharArray();
        int num = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ch[ch.length-1-i]) {
                num = 1; break;

            }
        }

        if (num == 0) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }


    }
}
