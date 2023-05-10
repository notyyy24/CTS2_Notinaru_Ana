package observer.clase;

public interface IRestaurant {
    void abonareClient(IClient client);
    void dezaabonareClient(IClient client);
    void notificare(String mesaj);
}