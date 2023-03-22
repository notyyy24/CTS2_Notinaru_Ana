package factory_method.clase;

import factory_method.clase.PersonalSpital;

public class Medic extends PersonalSpital {
    public Medic(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Medicul este " + super.getNume());;
    }
}
