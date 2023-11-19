import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {

        Departement dep1 = new Departement(1, "Informatique", 50);
        Departement dep2 = new Departement(2, "Ressources Humaines", 30);
        Departement dep3 = new Departement(3, "Finance", 40);
        DepartementHashSet departementHashSet = new DepartementHashSet();

        departementHashSet.ajouterDepartement(dep1);
        departementHashSet.ajouterDepartement(dep2);
        departementHashSet.ajouterDepartement(dep3);

        System.out.println("Liste des départements :");
        departementHashSet.displayDepartement();

        String nomRecherche = "Informatique";
        if (departementHashSet.rechercherDepartement(nomRecherche)) {
            System.out.println("Le département '" + nomRecherche + "' a été trouvé.");
        } else {
            System.out.println("Le département '" + nomRecherche + "' n'a pas été trouvé.");
        }

        departementHashSet.supprimerDepartement(dep2);

        System.out.println("\nListe des départements après suppression :");
        departementHashSet.displayDepartement();

        TreeSet<Departement> departementsTries = departementHashSet.trierDepartementById();
        System.out.println("\nListe des départements triés par ID :");
        for (Departement departement : departementsTries) {
            System.out.println(departement);
        }
    }
}
