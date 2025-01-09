package Phan1;
import java.util.*;
public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem cua HS: ");
        double diem = sc.nextDouble();
        if (diem < 0 || diem > 10) System.out.println("Vui long nhap diem hop le");
        else  {
            if (diem < 5) System.out.println("Hoc luc Yeu");
            else if (diem < 6) System.out.println("Hoc luc Trung binh");
            else if (diem < 7) System.out.println("Hoc luc Trung binh kha");
            else if (diem < 8) System.out.println("Hoc luc Kha");
            else if (diem < 9) System.out.println("Hoc luc Gioi");
            else System.out.println("Hoc luc Xuat sac");
        }
    }
}
