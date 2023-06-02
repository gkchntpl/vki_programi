import java.util.Scanner;
public class vki_programi {
    public static void main(String[] args) {

        double kgKilo, mBoy;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        mBoy = input.nextDouble();

        System.out.print("Lütfen kilonuzu kilogram cinsinden giriniz: ");
        kgKilo = input.nextDouble();

        double vki;
        vki = (kgKilo) / (mBoy * mBoy);

        System.out.println("Vücut Kitle Endeksiniz: " + vki);

    }
}
