package Phan2;

import java.util.*;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap phan tu thu %d: ", i + 1);
            arr[i] = sc.nextDouble();
        }
//        In ra mh
        System.out.println("Mang vua nhap:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.2f ", arr[i]);
        }
        System.out.println();
//        sap xep tang dan
        Arrays.sort(arr);
        System.out.println("Mang sap xep theo thu tu tang dan:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.2f ", arr[i]);
        }
//        min, max
        double min = arr[0];
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
