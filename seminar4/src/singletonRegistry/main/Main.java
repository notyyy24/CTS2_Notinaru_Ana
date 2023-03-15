package singletonRegistry.main;

import singletonRegistry.clase.InstitutiePublica;

public class Main {
    public static void main(String[] args) {
        InstitutiePublica politie = InstitutiePublica.getInstitutieOptimizata("Politia");
        InstitutiePublica pompieri = InstitutiePublica.getInstitutieOptimizata("Pompieri");
        InstitutiePublica politieLocala = InstitutiePublica.getInstitutieOptimizata("Politia Locala");

        politie.setNumarAngajati(10);
        politieLocala.setNumarAngajati(20);
        pompieri.setNumarAngajati(42);

        System.out.println(politie);
        System.out.println(politieLocala);
        System.out.println(pompieri);
    }
}
