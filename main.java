import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen yıl giriniz: ");
        a = input.nextInt();

        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0){
            System.out.print(a + " artık bir yıldır");
        } else {
            System.out.print(a + " artık bir yıl değildir");
        }
    }
}