package restaurant.adapter.bucatarie;

public class Bucatarie implements ISoftRestaurant{
    private String numeBucatar;


    public Bucatarie(String numeBucatar) {
        this.numeBucatar = numeBucatar;
    }

    @Override
    public void printeazaNota(double totalSuma) {
        System.out.println("Bucatarul " + this.numeBucatar);
        System.out.println("Nota dvs este in valoare de " + totalSuma);
    }
}
