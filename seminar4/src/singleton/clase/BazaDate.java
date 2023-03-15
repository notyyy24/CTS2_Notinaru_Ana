package singleton.clase;

public class BazaDate {
    private int dimensiuneDate;
    private int numarTabele;
    private String denumireBazaDate;

    public static BazaDate instanta=new BazaDate(100,2,"sql");

    private BazaDate() {

    }

    private BazaDate(int dimensiuneDate, int numarTabele, String denumireBazaDate) {
        this.dimensiuneDate = dimensiuneDate;
        this.numarTabele = numarTabele;
        this.denumireBazaDate = denumireBazaDate;
    }

    public static BazaDate getInstanta() {
        return instanta;
    }

    public void setDimensiuneDate(int dimensiuneDate) {
        this.dimensiuneDate = dimensiuneDate;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BazaDate{");
        sb.append("dimensiuneDate=").append(dimensiuneDate);
        sb.append(", numarTabele=").append(numarTabele);
        sb.append(", denumireBazaDate='").append(denumireBazaDate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
