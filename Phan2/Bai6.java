package Phan2;
import java.util.*;
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Nhap so phan tu cua day: ");
        int n = sc.nextInt();
        int[] tmp = new int[n];
        for (int i = 0; i < n; i++) {
            tmp[i] = rand.nextInt(81) + 10;
        }
        System.out.printf("Day so %d phan tu random tu 10 den 90 la: \n", n);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", tmp[i]);
        }
        System.out.println();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int cuoi = tmp[i] % 10;
            if (cuoi == 2 || cuoi == 4 || cuoi == 6) {
                A.add(tmp[i]);
            }
        }
        if (A.size() == 0) {
            System.out.printf("Khong co so nao thoa man.");
        } else {
            System.out.printf("Day so gom cac so ket thuc la 2 4 6 la: \n");
            for (int i : A) {
                System.out.printf("%d ", i);
            }
        }
    }
}
