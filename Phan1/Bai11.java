package Phan1;
import java.util.*;
public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap day lon a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap day be b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap chieu cao h: ");
        double h = sc.nextDouble();
        System.out.printf("Dien tich hinh thang la: %.3f", ((a + b) * h )/2.0);
    }
}
