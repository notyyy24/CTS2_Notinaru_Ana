package strategy.main;


import strategy.clase.Calator;
import strategy.clase.PlataCardBancar;
import strategy.clase.PlataCardCalatorii;
import strategy.clase.PlataPrinSms;

public class Main {
    public static void main(String[] args) {
        Calator calator = new Calator("Kraken");
        calator.platesteBilet(40);
        calator.setMetodaPlata(new PlataPrinSms());
        calator.platesteBilet(25);
        calator.setMetodaPlata(new PlataCardBancar());
        calator.platesteBilet(14);
        calator.setMetodaPlata(new PlataCardCalatorii());
        calator.platesteBilet(33);
    }
}