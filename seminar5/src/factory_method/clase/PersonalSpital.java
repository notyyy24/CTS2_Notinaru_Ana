package factory_method.clase;

public abstract class PersonalSpital {
    private String nume;

    public PersonalSpital(String nume) {
        this.nume=nume;
    }

    public String getNume() {
        return nume;
    }

    public abstract void afiseazaDescriere();


}
