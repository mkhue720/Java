package Phan1;
import java.util.*;
public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so giay: ");
        int t = sc.nextInt();
        int gio = t / 3600;
        int phut = (t % 3600) / 60;
        int giay = (t % 3600) % 60;
        System.out.printf("%d giay duoc viet thanh %02d:%02d:%02d", t, gio, phut, giay);
    }
}
