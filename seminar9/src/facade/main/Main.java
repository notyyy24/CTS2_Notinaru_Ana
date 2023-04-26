package facade.main;

import facade.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade1 = new Facade();
        facade1.interneazaPacient("Maria");
        facade1.interneazaPacient("Ana");
        facade1.interneazaPacient("Andrei");
        facade1.interneazaPacient("Maria");
    }
}
