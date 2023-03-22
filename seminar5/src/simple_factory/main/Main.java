package simple_factory.main;

import simple_factory.clase.PersonalSpital;
import simple_factory.clase.SimpleFactory;
import simple_factory.clase.TipPersonal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        List<PersonalSpital> list = new ArrayList<>();
        PersonalSpital personalSpital1 = simpleFactory.crearePersonal(TipPersonal.MEDIC,"Andrei");
        PersonalSpital personalSpital2 = simpleFactory.crearePersonal(TipPersonal.ASISTENT,"Andreea");
        PersonalSpital personalSpital3 = simpleFactory.crearePersonal(TipPersonal.BRANCARDIER,"Alex");
        PersonalSpital personalSpital4 = simpleFactory.crearePersonal(TipPersonal.MEDIC,"Vali");
        PersonalSpital personalSpital5 = simpleFactory.crearePersonal(TipPersonal.ANESTEZIST,"Vali",5);
        list.addAll(List.of(personalSpital1,personalSpital2,personalSpital3,personalSpital4,personalSpital5));
        for(PersonalSpital personalSpital: list) {
            personalSpital.afiseazaDescriere();
        }
    }
}
