package views;

import Metier.MetierImpl;
import dao.daoImpl;

public class view {

    public static void main(String[] args) {

    /*
    Instantiation static
     */
        MetierImpl metier=new MetierImpl();
        daoImpl daoImpl = new daoImpl();
        metier.setIdao(daoImpl);

        System.out.println(metier.calcule());
    }
}
