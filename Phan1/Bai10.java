package Phan1;

public class Bai10 {
    public static void main(String[] args) {
        int tongCon = 36;
        int tongChan = 100;
        for (int ga = 0; ga < tongCon; ga++) {
            int cho = tongCon - ga;
            int chan = 2 * ga + 4 * cho;
            if (chan == tongChan) {
                System.out.printf("So ga: %d\nSo cho: %d\n", ga, cho);
            }
        }
    }
}
