import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi Giriniz :");
        int sayi = input.nextInt();
        int k =1;
        while (k <= sayi) {
            System.out.println(k);
            k = k * 2;
        }
    }
}