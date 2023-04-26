package decorator.main;

import decorator.clase.DecoratorAbstract;
import decorator.clase.IFurnizareRezultate;
import decorator.clase.RezultatOnline;
import decorator.clase.RezultatPeHartie;

public class Main {
    public static void main(String[] args) {
        IFurnizareRezultate rezultate = new RezultatPeHartie();
        rezultate.printeazaRezultat("Este bine");

        DecoratorAbstract decorator = new RezultatOnline(rezultate);
        decorator.afisareOnline("Raceala");
        decorator.printeazaRezultat("Gripa");
    }
}
