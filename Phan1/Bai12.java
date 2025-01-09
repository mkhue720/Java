package Phan1;
import java.util.*;
import java.lang.*;
public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap R: ");
        double r = sc.nextDouble();
        if (r <= 0) System.out.println("Vui long nhap R thoa man");
        System.out.printf("Chu vi hinh tron: %.3f\n", 2 * Math.PI * r);
        System.out.printf("Dien tich hinh tron: %.3f", Math.PI * r * r);
    }
}
