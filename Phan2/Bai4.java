package Phan2;
import java.util.*;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi S: ");
        String S = scanner.nextLine();
        System.out.print("Nhập từ cần tìm: ");
        String word = scanner.nextLine();
        if (S.contains(word)) {
            System.out.println("Từ '" + word + "' có trong chuỗi S.");
        } else {
            System.out.println("Từ '" + word + "' không có trong chuỗi S.");
        }
    }
}
