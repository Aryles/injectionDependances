package views;

import Metier.IMetier;
import dao.Idao;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class view2 {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new File("src/main/resources/config.txt"));
            String daoClassName= scanner.nextLine();
         //   System.out.println(daoClassName);
            //chargement de la classe
            Class cDao=Class.forName(daoClassName);
            //instantiation de la classe
            Idao dao= (Idao)cDao.newInstance();
            String metierClassName= scanner.nextLine();
            Class cMetier=Class.forName(metierClassName);
            IMetier metier= (IMetier) cMetier.newInstance();
            Method method= cMetier.getMethod("setIdao",Idao.class);
            method.invoke(metier,dao);

            System.out.println(metier.calcule());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
