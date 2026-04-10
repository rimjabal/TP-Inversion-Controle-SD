package pres;

import dao.IDao;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;
import metier.IMetier;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(new File("config.txt"))) {
            String daoClassName = scanner.nextLine();
            Class<?> cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.getDeclaredConstructor().newInstance();

            String metierClassName = scanner.nextLine();
            Class<?> cMetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetier.getDeclaredConstructor().newInstance();

            Method method = cMetier.getMethod("setDao", IDao.class);
            method.invoke(metier, dao);

            System.out.println("Resultat par instanciation dynamique : " + metier.calcul());
        }
    }
}
