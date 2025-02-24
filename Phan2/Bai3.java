package Phan2;
import java.util.*;
public class Bai3 {
    public static int dem(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        String[] words = s.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String chuoi = sc.nextLine();
        System.out.printf("Do dai chuoi la: %d", dem(chuoi));
    }
}
