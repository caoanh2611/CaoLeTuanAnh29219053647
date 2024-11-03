package caoletuananh.pkg29219053647;

import java.util.Scanner;
import java.lang.Math;

public class CaoLeTuanAnh29219053647 {

    public static void Equationlv1(double a, double b) {
        double x;
        if (a != 0) {
            x = -a / b;
            System.out.println("The equation has only one solution : " + x);
        } else if (a == 0 && b != 0) {
            System.out.println("The equation has no solution ! ");
        } else if (a == 0 && b == 0) {
            System.out.println("The equation has a true solution for all x evry R ! ");
        }
    }

    public static void Equationlv2(double a, double b, double c) {
        double x1, x2, x, Denta = 0;
        Denta = Math.pow(b, 2) - 4 * a * c;
        if (a != 0) {
            if (Denta > 0) {
                System.out.println("The equation has 2 distinct solution ! ");
                x1 = (-b + Math.sqrt(Denta)) / 2 * a;
                System.out.println("The equation has x1 solution : " + x1);
                x2 = (-b - Math.sqrt(Denta)) / 2 * a;
                System.out.println("The equation has x1 solution : " + x2);
            } else if (Denta == 0) {
                x = -b / 2 * a;
                System.out.println("The equation has x1 solution : " + x);
            } else {
                System.out.println("The equation has no solution ! ");
            }
        } else {
            System.out.println("Coefficient 'a' must not be zero for a quadratic equation.");
        }

    }

    public static void main(String[] args) {
        Scanner Equation = new Scanner(System.in);
        System.out.print("Choie Equationlv1 of Equationlv2(Enter number 1 for lv1 and 2 for lv2): ");
        int n = Equation.nextInt();
        switch (n) {
            case 1:
                System.out.println("The equationlv1 (ax+b=0)!");
                System.out.print("Enter is a :");
                double a = Equation.nextDouble();
                System.out.print("Enter is b :");
                double b = Equation.nextDouble();
                
                System.out.println("Is a :" + a);
                System.out.println("Is b :" + b);
                Equationlv1(a, b);
                break;
            case 2:
                System.out.println("The equationlv2 (ax^2+bx+c=0)!");
                System.out.print("Enter is a :");
                double a1 = Equation.nextDouble();
                System.out.print("Enter is b :");
                double b1 = Equation.nextDouble();
                System.out.print("Enter is c :");
                double c = Equation.nextDouble();
                
                System.out.println("Is a :" + a1);
                System.out.println("Is b :" + b1);
                System.out.println("Is c :" + c);
                Equationlv2(a1, b1, c);
                break;
            default:
                System.out.println("Invalid choice! Please enter 1 or 2.");
                break;
        }

    }
}
