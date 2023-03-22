package simple_factory.clase;

public class SimpleFactory {
    public PersonalSpital crearePersonal(TipPersonal tipPersonal, String nume) {
        switch (tipPersonal) {
            case MEDIC: return new Medic(nume);
            case BRANCARDIER: return new Brancardier(nume);
            case ASISTENT: return new Asistent(nume);
            default: return null;
        }
    }

    public PersonalSpital crearePersonal(TipPersonal tipPersonal, String nume, Integer aniVechime) {
        switch (tipPersonal) {
            case ANESTEZIST: return new Anestezist(nume, aniVechime);
            default: return crearePersonal(tipPersonal,nume);
        }
    }
}
