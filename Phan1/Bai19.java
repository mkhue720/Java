//số hoàn hảo là một số nguyên dương mà tổng các ước nguyên dương thực sự của nó (các số nguyên dương bị nó chia hết ngoại trừ nó) bằng chính nó.
package Phan1;
import java.util.*;
public class Bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Phan tu thu %d: ", i + 1);
            a[i] = sc.nextDouble();
        }
        System.out.println("Cac so hoan hao trong day: ");
        for (int i = 0; i < n; i++) {
            if (a[i] == (int)a[i] && check((int)a[i])) System.out.print((int)a[i] + " ");
        }
    }
    public static boolean check (int n) {
        if (n <= 1) return false;
        int tong = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                tong += i;
                if (i != 1 && i != n / i) tong += n / i;
            }
        }
        return tong == n;
    }
}
