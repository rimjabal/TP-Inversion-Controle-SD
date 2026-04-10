# TP Inversion de Controle

Ce projet implemente le TP d'inversion de controle et d'injection des dependances avec Java et Spring.
<img width="545" height="526" alt="image" src="https://github.com/user-attachments/assets/e2ee2df2-2784-47b4-8693-63664159a68c" />

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
