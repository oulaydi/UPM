public class ProduitFrais extends Produit{

    private double prixRefrigeration;

    public ProduitFrais(String nom, double prixUnitaire, double prixRefrigeration){
        super(nom, prixUnitaire);
        this.prixRefrigeration = prixRefrigeration;
    }
	
    public double getPrixRefrigeration(){
        return prixRefrigeration;
    }
    
    @Override
	public double calculerPrix() {
        return  prixRefrigeration * getPrixUnitaire();
        // System.out.println( prixRefrigeration * getPrixUnitaire());
    }
    
}
