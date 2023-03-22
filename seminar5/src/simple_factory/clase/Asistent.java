package simple_factory.clase;

public class Asistent extends PersonalSpital {
    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Asistentul este " + super.getNume());;
    }
}