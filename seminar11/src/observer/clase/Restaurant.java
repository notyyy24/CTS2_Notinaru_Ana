package observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{
    private String nume;

    private List<IClient> lista;

    public Restaurant(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>();
    }

    @Override
    public void abonareClient(IClient client) {
        this.lista.add(client);

    }

    @Override
    public void dezaabonareClient(IClient client) {
        this.lista.remove(client);
    }

    @Override
    public void notificare(String mesaj) {
        for(IClient client1:lista)
        {
            client1.primesteNotificare(mesaj);
        }
    }

    public void introduceOfertaNoua()
    {
        String mesaj=new String(this.nume +" a introdus o oferta noua");

        notificare(mesaj);

    }


    public void adaugaDiscount(int discount)
    {
        String mesaj=new String(this.nume +" a introdus un nou discount" + discount + "%");
        notificare(mesaj);

    }



}