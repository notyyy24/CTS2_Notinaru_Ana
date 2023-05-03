package composite.main;

import composite.clase.Filiala;
import composite.clase.Sucursala;
import composite.clase.UnitateBancara;

public class Main {
    public static void main(String[] args) {
        UnitateBancara sucursala1 = new Sucursala("Sucursala1",28);
        UnitateBancara sucursala2 = new Sucursala("Sucursala2",66);
        UnitateBancara agentie1 = new Sucursala("Agentie1",45);
        UnitateBancara agentie2 = new Sucursala("Agentie2",22);
        UnitateBancara filiala1 = new Filiala("Filiala1",12);
        UnitateBancara filiala2 = new Filiala("Filiala2",31);
        UnitateBancara filiala3 = new Filiala("Filiala3",43);

        sucursala1.adaugaUnitate(sucursala2);
        sucursala1.adaugaUnitate(agentie1);
        sucursala1.adaugaUnitate(filiala1);

        sucursala2.adaugaUnitate(agentie2);
        sucursala2.adaugaUnitate(filiala2);

        agentie1.adaugaUnitate(filiala3);

        sucursala1.printDescriere("       ");
    }
}
