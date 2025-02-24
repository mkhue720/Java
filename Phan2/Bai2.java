package Phan2;

import java.util.*;
public class Bai2 {
    public static boolean chinhphuong(int a) {
        int tmp = (int) Math.sqrt(a);
        if (tmp * tmp == a) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap phan tu thu %d: ", i + 1);
            arr[i] = sc.nextInt();
        }
        System.out.println();
//        trung binh cac so khong am
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
                count++;
            }
        }
        double avg = (double) sum / count;
        System.out.printf("Trung binh cac so khong am cua mang la: %.2f\n", avg);
//        chia het cho 3 nhung khong chia het cho 6
        System.out.println("Cac so chia het cho 3 nhung khong chia het cho 6 trong mang la: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
//        so chinh phuong
        System.out.println("So chinh phuong trong mang la: ");
        for (int i = 0; i < arr.length; i++) {
            if (chinhphuong(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
