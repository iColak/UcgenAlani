package githubPatika;
import java.util.Scanner;

public class UcgeninAlani {
    public static void main(String[] args) {
        double kenar1, kenar2, kenar3;

        //Scanner sınıfını oluşturalım
        Scanner input = new Scanner(System.in);

        System.out.print("1. kenarı giriniz: ");
        kenar1 = input.nextDouble();

        System.out.print("2. kenarı giriniz: ");
        kenar2 = input.nextDouble();

        System.out.print("3. kenarı giriniz: ");
        kenar3 = input.nextDouble();

        //Alan formulünden Üçgenin çevresi 2u ise Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        double u = (kenar1+kenar2+kenar3)/2;
        double alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Üçgenin Alanı: " + alan + "cm2 dir.");


    }
}
