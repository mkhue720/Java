package Phan2;
import java.util.*;
import java.util.regex.Pattern;

public class Bai5 {
    private static String getInput(Scanner scanner, String message, String regex) {
        String input;
        while (true) {
            System.out.print(message);
            input = scanner.nextLine().trim();
            if (Pattern.matches(regex, input)) {
                break;
            } else {
                System.out.println("Dữ liệu không hợp lệ, vui lòng nhập lại!");
            }
        }
        return input;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Kiểm tra nhập thông tin theo regex
        String maNhanVien = getInput(sc, "Nhập mã nhân viên (3 chữ cái + 3 chữ số): ", "^[A-Za-z]{3}\\d{3}$");
        String hoTen = getInput(sc, "Nhập họ và tên (tối thiểu 5 ký tự): ", "^.{5,}$");
        String diaChi = getInput(sc, "Nhập địa chỉ (tối đa 30 ký tự): ", "^.{1,30}$");
        String soDienThoai = getInput(sc, "Nhập số điện thoại (10 chữ số): ", "^\\d{10}$");
        String ngaySinh = getInput(sc, "Nhập ngày sinh (dd-mm-yyyy): ", "^\\d{2}-\\d{2}-\\d{4}$");
        String email = getInput(sc, "Nhập email: ", "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
        String soCMND = getInput(sc, "Nhập số CMND (9 số): ", "^\\d{9}$");

        // In thông tin hợp lệ
        System.out.println("\nThông tin nhập hợp lệ:");
        System.out.println("Mã nhân viên: " + maNhanVien);
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Số điện thoại: " + soDienThoai);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Email: " + email);
        System.out.println("Số CMND: " + soCMND);
    }
}
