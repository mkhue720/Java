package Phan1;
import java.util.*;
public class Bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu muon nhap: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean tang = true;
        boolean giam = true;
        for (int i = 0; i < n; i++) {
            System.out.printf("Phan tu thu %d: ", i + 1);
            a[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) giam = false;
            else if (a[i] < a[i - 1]) tang = false;
        }
        if (tang) System.out.println("Day so la day tang");
        else if (giam) System.out.println("Day so la day giam");
        else System.out.println("Day so la day khong tang khong giam");
    }
}
