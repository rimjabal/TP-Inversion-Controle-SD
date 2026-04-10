# TP Inversion de Controle

Ce projet implemente le TP d'inversion de controle et d'injection des dependances avec Java et Spring.

## Contenu

- `dao.IDao` avec la methode `getData()`
- `dao.DaoImpl` comme implementation DAO
- `metier.IMetier` avec la methode `calcul()`
- `metier.MetierImpl` basee sur un couplage faible via l'interface `IDao`

## Injections des dependances

- `pres.Pres1` : instanciation statique
- `pres.Pres2` : instanciation dynamique avec reflection et `config.txt`
- `pres.PresSpringXML` : injection avec Spring XML
- `pres.PresSpringAnnotations` : injection avec Spring annotations

## Configuration Spring

- `src/main/resources/config.xml` contient la configuration XML
- `@Component` et `@Autowired` sont utilises pour la version annotations
