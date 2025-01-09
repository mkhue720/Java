package Phan1;
import java.util.*;
import java.lang.*;
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Giai va bien luan phuong trinh bac 2 ***");
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap c: ");
        double c = sc.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta < 0) System.out.println("Phuong trinh vo nghiem");
        if (delta == 0) System.out.printf("Phuong trinh co nghiem kep: x1 = x2 = %.3f\n", - b / 2 * a);
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf("Phuong trinh co 2 nghiem phan biet:\n x1 = %.3f\n x2 = %.3f", x1, x2);
    }
}
