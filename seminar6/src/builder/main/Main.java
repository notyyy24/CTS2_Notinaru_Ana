package builder.main;

import builder.clase.ContBancar;
import builder.clase.ContBancarBuilder;
import builder.clase.ContBuilder;
import builder.clase.IBuilder;

public class Main {
    public static void main(String[] args) {
        IBuilder contBuilder = new ContBuilder();
        contBuilder.setNumeClient("Popescu").setCardAtasat(true);
        ContBancar contBancar = contBuilder.build();

        ContBancar contBancar1 = contBuilder.setNumeClient("Andreea").setInternetBanking(true).build();
        System.out.println(contBancar);
        System.out.println(contBancar1);

        IBuilder contBancarBuilder = new ContBancarBuilder();
        ContBancar cont = contBancarBuilder.setInternetBanking(true).setNumeClient("Ana").build();
        ContBancar cont2 = contBancarBuilder.setNumeClient("Maria").setPrimesteSalariu(true).build();
        System.out.println(cont);
        System.out.println(cont2);

    }
}
