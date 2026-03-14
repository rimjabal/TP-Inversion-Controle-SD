package metier;
import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; // Couplage faible : on utilise l'interface

    @Override
    public double calcul() {
        double d = dao.getData();
        return d * 10;
    }

    // Indispensable pour l'injection des dépendances
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}