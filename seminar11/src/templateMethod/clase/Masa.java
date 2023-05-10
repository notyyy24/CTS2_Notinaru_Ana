package templateMethod.clase;

public class Masa extends IMasa{
    public Masa(int nr) {
        super(nr);
    }

    @Override
    protected void curataMasa() {
        System.out.println("S-a curatat masa");
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("S-au asezat servetele");
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("S-au asezat tacamuri");
    }
}