package Phan1;
import java.util.*;
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap canh b: ");
        double b = sc.nextDouble();
        System.out.printf("Chu vi tu giac vuong la: %.3f", 2 * (a + b));
        System.out.printf("Dien tich tu giac vuong la: %.3f", a * b);
    }
}
