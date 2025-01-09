package Phan1;
import java.util.*;
import java.lang.Math;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x = sc.nextInt();
        System.out.printf("y = %.0f", Math.pow(2, x));
    }
}
