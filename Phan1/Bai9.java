package Phan1;
import java.util.*;
import java.lang.*;
public class Bai9 {
    public static long giaithua(int x) {
        long tich = 1;
        for (int i = 1; i <= x; i++) {
            tich *= i;
        }
        return tich;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** TINH TONG CHUOI SO ***");
        System.out.print("Nhap x: ");
        int x = sc.nextInt();
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += Math.pow(x, i) / giaithua(i);
        }
        System.out.printf("S<%d, %d> = %.3f", x, n, tong);
    }
}
