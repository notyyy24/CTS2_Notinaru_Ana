package decorator.clase;

public abstract class DecoratorAbstract implements IFurnizareRezultate{
    private IFurnizareRezultate atr;

    @Override
    public void printeazaRezultat(String diagnostic) {
        atr.printeazaRezultat(diagnostic);
    }

    public DecoratorAbstract(IFurnizareRezultate atr) {
        this.atr = atr;
    }

    public abstract void afisareOnline(String diagnostic);
}
