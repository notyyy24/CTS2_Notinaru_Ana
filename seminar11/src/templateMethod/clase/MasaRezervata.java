package templateMethod.clase;

public class MasaRezervata extends IMasa{

    private int ora;
    public MasaRezervata(int nr, int ora) {
        super(nr);
        this.ora=ora;
    }

    @Override
    protected void curataMasa() {
        System.out.println("Masa este curatata la ora"+ora);
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Masa are servetele curate la ora"+ora);
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Masa are tacamuri curate la ora"+ora);
    }
}