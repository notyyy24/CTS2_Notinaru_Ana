package templateMethod.clase;

public abstract class IMasa {

    private int nr;

    public IMasa(int nr) {
        this.nr = nr;
    }

    protected abstract void curataMasa();
    protected abstract void aseazaServetele();
    protected abstract void aseazaTacamuri();
    public final void ocupaMasa()
    {
        curataMasa();
        aseazaServetele();
        aseazaTacamuri();

    }


}