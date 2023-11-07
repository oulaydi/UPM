public class Livre implements Document {

	private String titre;
	private String auteur;
	private int anneePublication;

	public Livre(String titre, String auteur, int anneePublication) {
		this.titre = titre;
		this.auteur = auteur;
		this.anneePublication = anneePublication;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getAnneePublication() {
		return anneePublication;
	}

	public void setAnneePublication(int anneePublication) {
		this.anneePublication = anneePublication;
	}

    @Override
    public void afficherDetails() {
        System.out.println(TITRE);
    }
    
    @Override
    public void emprunter() {
        System.out.println("Dar anacher 132");
    }
    
    @Override
    public void retourner() {
        System.out.println("Thomas hamid");
        
    }
}
