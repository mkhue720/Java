package Phan1;
import java.util.*;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Giai va bien luan phuong trinh bac 1 ***");
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        if (a == 0 && b != 0) System.out.println("Phuong trinh vo nghiem");
        if (a == 0 && b == 0) System.out.println("Phuong trinh vo so nghiem");
        if (a != 0) System.out.printf("Phuong trinh 1 nghiem %.3f", -b/a);
    }
}
