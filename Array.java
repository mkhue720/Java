import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = {3, 7, 23, -45, 33, 73, -56};
        int sum = 0, count = 0;
        double avg = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                sum += A[i];
                count++;
            }
        }
        avg = (double) sum / count;
        System.out.printf("Trung binh cong cac so chan: %.2f\n", avg);
        int min = A[0];
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
            }
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Mang goc: " + Arrays.toString(A));
        Arrays.sort(A);
        System.out.println("Mang sau khi sort: " + Arrays.toString(A));
        int tmp = Arrays.binarySearch(A, 23);
        System.out.println("Vi tri cua 23 la: " + tmp);
        Arrays.fill(A, 23);
        System.out.println("Mang sau khi fill: " + Arrays.toString(A));
    }
}
