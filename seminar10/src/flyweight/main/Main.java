package flyweight.main;

import flyweight.clase.Cont;
import flyweight.clase.FlyweightFactory;
import flyweight.clase.IClientBanca;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory fabrica = new FlyweightFactory();
        Cont cont1 = new Cont(2300f,12);
        Cont cont2 = new Cont(4000f,3);
        Cont cont3 = new Cont(5000f,25);

        IClientBanca detinator = fabrica.getDetinator("Ion","0722145638","Str. Manzului");
        detinator.descriere(cont1);
        fabrica.getDetinator("Maria","0722486291","Str. Insulei").descriere(cont2);
        fabrica.getDetinator("Ion","0722145638","Str. Manzului").descriere(cont3);
        fabrica.getDetinator("Maria","0722486291","Str. Insulei").descriere(cont1);
    }
}
