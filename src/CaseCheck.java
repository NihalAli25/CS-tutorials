import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        char ch = key.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lowercase");
        } else {
            System.out.println("Uppercase");
        }

    }
}
