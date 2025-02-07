package workshopjdbc;

import tn.edu.esprit.entities.Personne;
import tn.edu.esprit.services.ServicePersonne;

public class WorkshopJDBC {
    public static void main(String[] args) {
        ServicePersonne sp = new ServicePersonne();

        // ✅ Ajouter une personne
        Personne p1 = new Personne("boutheina", "rjab");
        sp.ajouter(p1);

        // ✅ Modifier une personne (supposons que l'ID = 1)
        Personne p2 = new Personne(1, "Ali", "Bouazizi");
        sp.modifier(p2);

        // ✅ Supprimer une personne (ID = 1)
        sp.supprimer(1);

        // ✅ Afficher toutes les personnes
        System.out.println(sp.getAll(null));
    }
}
