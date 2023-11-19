import java.util.TreeSet;

public class Departement implements IDepartement<Departement> {
    private int id;
    private String nomDepartement;
    private int nombreEmployes;

    public Departement() {
    }

    public Departement(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Departement that = (Departement) obj;

        if (id != that.id) {
            return false;
        }
        return nomDepartement.equals(that.nomDepartement);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nombreEmployes=" + nombreEmployes +
                '}';
    }


    @Override
    public void ajouterDepartement(Departement departement) {
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return false;
    }

    @Override
    public void supprimerDepartement(Departement departement) {
    }

    @Override
    public void displayDepartement() {
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        return null;
    }
}

