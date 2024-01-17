package at.technikum.Vorlesung4;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight, height, bmi;

        System.out.println("weight [kg]: ");
        weight = input.nextDouble();
        System.out.println("height [m]: ");
        height = input.nextDouble();
        System.out.printf("m= %.2fkg h= %.2fm -> BMI= %.2f (", weight, height, bmi = bmiCalc(height, weight));
        bmiMessage(bmiCategory(bmi));
        System.out.print(")\n");

        input.close();
    }

    public static double bmiCalc(double height, double weight) {

        double bmiCalc = weight / (height * height);

        if (height < 1.6 || weight < 40) return -1;

        return bmiCalc;
    }

    public static int bmiCategory(double bmi) {

        if (bmi > 0 && bmi < 15) return 10;
        if (bmi >= 15 && bmi < 16) return 11;
        if (bmi >= 16 && bmi < 18.5) return 12;
        if (bmi >= 18.5 && bmi < 25) return 20;
        if (bmi >= 25 && bmi < 30) return 30;
        if (bmi >= 30 && bmi < 35) return 40;
        if (bmi >= 35 && bmi < 40) return 41;
        if (bmi >= 40) return 42;

        return -1;
    }

    public static void bmiMessage(int bmiCategory) {

        switch (bmiCategory) {

            case 10:
                System.out.print("Very severely underweight");
                break;
            case 11:
                System.out.print("Severely underweight");
                break;
            case 12:
                System.out.print("Underweight");
                break;
            case 20:
                System.out.print("Normal");
                break;
            case 30:
                System.out.print("Overweight");
                break;
            case 40:
                System.out.print("Moderately obese");
                break;
            case 41:
                System.out.print("Severely obese");
                break;
            case 42:
                System.out.print("Very severely obese");
                break;
            default:
                System.out.print("invalid");
        }
    }
}
