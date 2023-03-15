package singleton.main;

import singleton.clase.BazaDate;
import singleton.clase.Secretariat;

public class Main {
    public static void main(String[] args) {
        Secretariat secretariat1 = Secretariat.getInstanta(198,20);
        Secretariat secretariat2 = Secretariat.getInstanta(2011,45);

        System.out.println(secretariat1);
        System.out.println(secretariat2);

        BazaDate bazaDate1=BazaDate.getInstanta();
        BazaDate bazaDate2=BazaDate.getInstanta();
        bazaDate1.setDimensiuneDate(200);
        bazaDate2.setDimensiuneDate(300);
        System.out.println(bazaDate1);
        System.out.println(bazaDate2);
    }
}
