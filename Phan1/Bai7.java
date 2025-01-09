package Phan1;
import java.util.*;
import java.lang.*;
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** CAC HAM LUONG GIAC ***");
        System.out.print("Nhap vao 1 goc: ");
        double x = sc.nextDouble();
        double a = x * Math.PI / 180.0;
        System.out.printf("sin(%.0f) = %f\n", x, Math.sin(a));
        System.out.printf("cos(%.0f) = %f\n", x, Math.cos(a));
        System.out.printf("tan(%.0f) = %f\n", x, Math.tan(a));
        System.out.printf("cotg(%.0f) = %f\n", x, 1 / Math.tan(a));
    }
}
