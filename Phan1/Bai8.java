package Phan1;
import java.util.*;
import java.lang.*;
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap canh b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap canh c: ");
        double c = sc.nextDouble();
        if (a + b > c || b + c > a || a + c > b) {
            double cv = a + b + c;
            double p = cv / 2;
            double dt = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("Chu vi tam giac la: %.3f\n", cv);
            System.out.printf("Dien tich tam giac la: %.3f\n", dt);
        } else System.out.println("Khong tao thanh tam giac");
    }
}
