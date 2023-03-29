package builder.clase;

public class ContBancarBuilder implements IBuilder{

    private boolean primesteSalariu;
    private boolean cardAtasat;
    private String numeClient;
    private boolean internetBanking;

    public ContBancarBuilder() {
        this.primesteSalariu=false;
        this.cardAtasat=false;
        this.numeClient="Anonim";
        this.internetBanking=false;
    }

    public IBuilder setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu=primesteSalariu;
        return this;
    }

    public IBuilder setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
        return this;

    }

    public IBuilder setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    public IBuilder setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
        return this;
    }

    public ContBancar build() {
        return new ContBancar(this.primesteSalariu,this.cardAtasat,this.numeClient,this.internetBanking);

    }
}
