package strategy.main;

import strategy.clase.Operator;
import strategy.clase.VerificarePersoanaJuridica;

public class Main {
    public static void main(String[] args) {
        Operator operator1 = new Operator();
        operator1.verificaClient();

        operator1.setModVerificare(new VerificarePersoanaJuridica());
        operator1.verificaClient();
    }
}
