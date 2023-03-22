package simple_factory.clase;

public class Brancardier extends PersonalSpital {
    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Brancardierul este " + super.getNume());;
    }
}
