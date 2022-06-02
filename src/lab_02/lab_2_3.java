package lab_02;

import java.util.Scanner;

public class lab_2_3 {
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
        double idealWeight;
        if (BMI < 18.5) {
            System.out.println("Under weight");
            idealWeight = Math.round((18.5 * inputHeight * inputHeight - inputWeight) * 10.0) / 10.0;
            System.out.println("you need increase " + idealWeight + " kg");
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
            idealWeight = Math.round((inputWeight - 24.9 * inputHeight * inputHeight) * 10.0) / 10.0;
            System.out.println("you need decrease " + idealWeight + " kg");
        }

    }
}

