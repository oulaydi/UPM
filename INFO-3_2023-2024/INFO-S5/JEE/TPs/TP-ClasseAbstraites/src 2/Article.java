public class Article implements Document {

    private String titre;
    private String auteurs;
    private String journal;

    public Article(String titre, String auteurs, String journal){
            this.titre = titre;
            this.auteurs = auteurs;
            this.journal = journal;
        }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(String auteurs) {
        this.auteurs = auteurs;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Magazine les Produits electronique");
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
