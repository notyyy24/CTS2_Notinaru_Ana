package factory_method.main;

import factory_method.clase.FactoryBrancardier;
import factory_method.clase.FactoryMedic;
import factory_method.clase.PersonalSpital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FactoryMedic factoryMedic = new FactoryMedic();
        FactoryBrancardier factoryBrancardier = new FactoryBrancardier();

        List<PersonalSpital> listaPersonal = new ArrayList<>();
        listaPersonal.add(factoryMedic.crearePersonal("Ciprian"));
        listaPersonal.add(factoryMedic.crearePersonal("Ana"));
        listaPersonal.add(factoryMedic.crearePersonal("Dana"));

    }
}
