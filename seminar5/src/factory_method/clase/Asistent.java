package factory_method.clase;

import factory_method.clase.PersonalSpital;

public class Asistent extends PersonalSpital {
    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Asistentul este " + super.getNume());;
    }
}