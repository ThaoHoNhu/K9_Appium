package lab_02;

import java.util.Scanner;

public class lab_2_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your height(m):");
        double inputHeight = scanner.nextDouble();
        System.out.println("Input your weight(kg):");
        double inputWeight = scanner.nextDouble();
        double BMI_raw = inputWeight / (inputHeight * inputHeight);
        //System.out.println(BMI_raw);
        double BMI = Math.round(BMI_raw * 10.0) / 10.0;
        //System.out.println(BMI);
        if (BMI < 18.5) {
            System.out.println("Under weight");
        } else {
            if (BMI >= 18.5 && BMI <= 24.9) {
                System.out.println("Normal weight");
            } else {
                if (BMI >= 25 && BMI <= 29.9) {
                    System.out.println("Over weight");
                } else {
                    System.out.println("Obesity");
                }
            }
        }

    }
}

