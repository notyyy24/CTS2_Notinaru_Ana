package composite.clase;
//nodul frunza
public class Filiala implements UnitateBancara{
    private String numeFiliala;
    private int numarAngajati;

    public Filiala(String numeFiliala, int numarAngajati) {
        this.numeFiliala = numeFiliala;
        this.numarAngajati = numarAngajati;
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        throw new RuntimeException();
    }

    @Override
    public void stergeUnitate(UnitateBancara unitateBancara) {
        throw new RuntimeException();
    }

    @Override
    public UnitateBancara getUnitate(int index) {
        throw new RuntimeException();
    }

    @Override
    public void printDescriere(String indentare) {
        System.out.println(indentare + "Filiala " + this.numeFiliala + " are " + this.numarAngajati + " angajati.");
    }
}
