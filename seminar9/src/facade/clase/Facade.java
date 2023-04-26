package facade.clase;

public class Facade {
    private Medic medic;
    private Salon salon;

    public Facade() {
        this.medic = new Medic();
        medic.adaugarePacient(new Pacient("Ana",3));
        medic.adaugarePacient(new Pacient("Maria",7));
        medic.adaugarePacient(new Pacient("Andrei",5));
        this.salon = new Salon();
        salon.adaugaPaturiLibere(546);
        salon.adaugaPaturiLibere(985);
    }

    public void interneazaPacient(String nume) {
        if(medic.verificaTrimitere(medic.getPacient(nume))) {
            if(salon.verificaPaturiLibere()) {
                if(medic.getPacient(nume).getGravitate()>4) {
                    salon.ocupaPat();
                    System.out.println("Pacientul " + nume + " a fost internat");
                }
                else {
                    System.out.println("Pacientul nu are o stare grava");
                }
            }
            else {
                System.out.println("Nu exista paturi libere");
            }
        }
        else {
            System.out.println("Trebuie sa aveti trimitere de la medic");
        }
    }

}
