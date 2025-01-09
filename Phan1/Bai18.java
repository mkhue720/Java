package Phan1;
import java.util.*;
public class Bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua day so: ");
        int n = sc.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Phan tu thu %d: ", i + 1);
            a[i] = sc.nextDouble();
        }
        System.out.print("Nhap so x: ");
        int x = sc.nextInt();
        boolean check = false;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] + a[i + 1] == x) {
                check = true;
                System.out.printf("Hai phan tu lien nhau bang %d la a[%d] = %.3f va a[%d] = %.3f\n", x, i + 1, a[i],  i + 2, a[i + 1]);
                break;
            }
        }
        if (!check)  {
            System.out.printf("Khong co 2 phan tu lien nhau bang %d", x);
        }
    }
}
