public class Magazine implements Document {

    private String titre;
    private String catégorie;
    private int numéro;

    public Magazine(String titre, String catégorie, int numéro){
            this.titre = titre;
            this.catégorie = catégorie;
            this.numéro = numéro;
        }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getCatégorie() {
        return catégorie;
    }

    public void setCatégorie(String catégorie) {
        this.catégorie = catégorie;
    }

    public int getNuméro() {
        return numéro;
    }

    public void setNuméro(int numéro) {
        this.numéro = numéro;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Magazine Medina N°123, Marrakech pour les Produits electronique");
    }
    
    @Override
    public void emprunter() {
        System.out.println("c'est la methode emprunter()");
    }
    
    @Override
    public void retourner() {
        System.out.println("c'est la methode retourner()");
        
    }

}
