package state.clase;

public class Masa {

    private int nrMasa;

    private IStare stare;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        stare = (IStare) new StareLibera();
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public IStare getStare() {
        return stare;
    }

    protected void setStare(IStare stare)
    {
        stare=stare;
    }


    public void ocupareMasa(){
        IStare ocupata=new StareOcupata();
        ocupata.modificaStare(this);
    }

    public void rezervaMasa(){
        IStare rezervata=new StareRezervata();
        rezervata.modificaStare(this);
    }


    public void elibereazaMasa(){
        IStare libera=new StareLibera();
        libera.modificaStare(this);
    }

    public void anuleaza()
    {
        IStare libera=new StareLibera();
        libera.modificaStare(this);
    }

}