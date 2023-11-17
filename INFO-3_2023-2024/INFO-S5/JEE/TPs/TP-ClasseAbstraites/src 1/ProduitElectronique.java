public class ProduitElectronique extends Produit{
    
    private double garantie;
    double Qte;
    
    public ProduitElectronique(String nom, double prixUnitaire, double garantie, double Qte){
        super(nom, prixUnitaire);
        this.garantie = garantie;
    }

    public double getGarantie(){
        return garantie;
    }

    @Override
	public double calculerPrix() {
        return (getPrixUnitaire() * Qte) + getGarantie();
    }
}
