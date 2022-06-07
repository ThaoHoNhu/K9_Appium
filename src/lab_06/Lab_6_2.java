package lab_06;
import java.util.Scanner;

public class Lab_6_2 {

    public static void main(String[] args) {
        String myPassword = "password123";
        boolean isContinuing = true;
        int count = 0;
        while (isContinuing && count < 3) {
            System.out.print("Enter your password:");
            Scanner scanner = new Scanner(System.in);
            String inputPassword = scanner.nextLine();
            if (inputPassword.equals(myPassword)) {
                System.out.println("Password correct!");
                isContinuing = false;
            } else {
                count++;
            }
        }
    }
}

