package restaurant.proxy.main;

import restaurant.proxy.clase.IRestaurant;
import restaurant.proxy.clase.ProxyRestaurant;
import restaurant.proxy.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        //fara proxy
        IRestaurant restaurant = new Restaurant("Hush");
        restaurant.rezervaMasa(3);

        //cu proxy
        IRestaurant proxy = new ProxyRestaurant(restaurant);
        proxy.rezervaMasa(5);
        proxy.rezervaMasa(2);
    }
}
