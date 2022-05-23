package lab_02;
import java.util.Scanner;

public class lab_2_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number:");
        int intNumber = scanner.nextInt();
        int result = intNumber % 2;
        if (result == 0){
            System.out.println("this number is even");
        } else{
            System.out.println("this number is odd");
        }

    }
}
