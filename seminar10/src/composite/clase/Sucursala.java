package composite.clase;

import java.util.ArrayList;
import java.util.List;
//nodul composite
public class Sucursala implements UnitateBancara{
    private String numeSucursala;
    private int numarAngajati;
    private List<UnitateBancara> lista;

    public Sucursala(String numeSucursala, int numarAngajati) {
        this.numeSucursala = numeSucursala;
        this.numarAngajati = numarAngajati;
        lista = new ArrayList<>();
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        lista.add(unitateBancara);
    }

    @Override
    public void stergeUnitate(UnitateBancara unitateBancara) {
        lista.remove(unitateBancara);
    }

    @Override
    public UnitateBancara getUnitate(int index) {
        return lista.get(index);
    }

    @Override
    public void printDescriere(String indentare) {
        System.out.println(indentare + "Sucursala " + this.numeSucursala + " are " + this.numarAngajati + " angajati.");
        for(UnitateBancara unitateBancara : lista) {
            unitateBancara.printDescriere(indentare + "    " + indentare);
        }
    }
}
