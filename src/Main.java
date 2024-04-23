import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //değerlerin belirlenmesi ardından değerlere ait TL cinsinden fiyatların ikinci satırda verilmesi.
        double armut, elma, domates, muz, patlican;
        double armutPrice = 2.14, elmaPrice = 3.67, domatesPrice = 1.11, muzPrice = 0.95, patlicanPrice = 5.0;

//tüm değerlerin kullanıcıya inputlar üzerinden aktarımı.
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo?: ");
        armut = input.nextDouble();
        System.out.print("Elma Kaç Kilo?: ");
        elma = input.nextDouble();
        System.out.print("Domates Kaç Kilo?: ");
        domates = input.nextDouble();
        System.out.print("Muz Kaç Kilo?: ");
        muz = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo?: ");
        patlican = input.nextDouble();

        //formülün ortaya çıkarılması.
        double toplam = ((armut * armutPrice) + (elma * elmaPrice) + (domates * domatesPrice) + (muz * muzPrice) + (patlican * patlicanPrice));

        System.out.println("Toplam Tutar: " + toplam + " TL");

    }
}