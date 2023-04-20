package restaurant.proxy.clase;

public class Restaurant implements IRestaurant{
    private String numeRestaurant;

    public Restaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    @Override
    public void rezervaMasa(int nrPersoane) {
        System.out.println("Masa a fost rezervata pt " + nrPersoane + " persoane la restaurantul " +numeRestaurant);
    }
}
