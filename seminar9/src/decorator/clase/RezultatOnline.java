package decorator.clase;

public class RezultatOnline extends DecoratorAbstract{
    public RezultatOnline(IFurnizareRezultate atr) {
        super(atr);
    }

    public void afisareOnline(String diagnostic) {
        System.out.println("Online: " + diagnostic);
    }
}
