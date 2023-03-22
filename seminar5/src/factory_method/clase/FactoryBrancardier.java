package factory_method.clase;

public class FactoryBrancardier implements Factory{
    @Override
    public PersonalSpital crearePersonal(String nume) {
        return new Brancardier(nume);
    }
}
