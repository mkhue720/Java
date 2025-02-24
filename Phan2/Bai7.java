package Phan2;
import java.util.*;
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap cac phan tu so nguyen: ");
        String input = sc.nextLine();
        String[] list = input.trim().split("\\s+");
        ArrayList<Integer> chan = new ArrayList<>();
        ArrayList<Integer> le = new ArrayList<>();
        for (String s : list) {
            int tmp = Integer.parseInt(s);
            if (tmp % 2 == 0) {
                chan.add(tmp);
            } else {
                le.add(tmp);
            }
        }
        Collections.sort(chan);
        Collections.sort(le, (o1, o2) -> o2 - o1);
        System.out.printf("Danh sach sau khi sap xep: \n");
        for (int i : chan) {
            System.out.printf("%d ", i);
        }
        System.out.printf("\n");
        for (int i : le) {
            System.out.printf("%d ", i);
        }
    }
}