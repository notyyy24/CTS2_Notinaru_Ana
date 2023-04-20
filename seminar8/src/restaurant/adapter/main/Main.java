package restaurant.adapter.main;

import restaurant.adapter.bar.ISoftBar;
import restaurant.adapter.bar.SoftBar;
import restaurant.adapter.bucatarie.AdapterObiecteRestaurant;
import restaurant.adapter.bucatarie.AdapterRestaurant;
import restaurant.adapter.bucatarie.Bucatarie;
import restaurant.adapter.bucatarie.ISoftRestaurant;

//ADAPTER DE CLASE

public class Main {
    public static void imprimare(ISoftRestaurant restaurant,double totalNota) {
        restaurant.printeazaNota(totalNota);
    }
    public static void main(String[] args) {
        ISoftBar bar = new SoftBar("Alcadibo");
       // bar.printeazaNotaBauturi(240);

        ISoftRestaurant bucatarie = new Bucatarie("George");
      //  bucatarie.printeazaNota(500);

      //eroare  Main.imprimare(bar,340);
        Main.imprimare(bucatarie,450);

        AdapterRestaurant adapter = new AdapterRestaurant("Alcadibo");
        Main.imprimare(adapter,459);

        //adapter de obiecte
        AdapterObiecteRestaurant adapterObiecte = new AdapterObiecteRestaurant(bar);
        imprimare(adapterObiecte,478);
    }
}
