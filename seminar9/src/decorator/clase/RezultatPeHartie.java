package decorator.clase;

public class RezultatPeHartie implements IFurnizareRezultate{
    @Override
    public void printeazaRezultat(String diagnostic) {
        System.out.println("Hartie: " + diagnostic);
    }
}
