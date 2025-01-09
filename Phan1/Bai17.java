package Phan1;
import java.util.*;
public class Bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // a
        for (int i = 2; i <= 9; i++) {
            System.out.printf("*** Bang cuu chuong %d ***\n", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
        }
        //b
        System.out.print("Nhap so k: ");
        int k = sc.nextInt();
        System.out.printf("*** Bang cuu chuong %d ***\n", k);
        for (int j = 1; j <= 10; j++) {
            System.out.printf("%d x %d = %d\n", k, j, k * j);
        }
    }
}
