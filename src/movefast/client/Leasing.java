package movefast.client;

/**
 *
 * @author Informatica
 */
public class Leasing extends Client {

    //Atributs
    protected String nifEmpresa;
    protected String nomEmpresa;

    //constructor
    public Leasing(String nifEmpresa, String nomEmpresa, String nom, String cognom, String dni, String direccio, int telefon) {
        super(nom, cognom, dni, direccio, telefon);
        this.nifEmpresa = nifEmpresa;
        this.nomEmpresa = nomEmpresa;
    }

    public String getNifEmpresa() {
        return nifEmpresa;
    }

    public void setNifEmpresa(String nifEmpresa) {
        this.nifEmpresa = nifEmpresa;
    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    @Override
    public String toString() {
        return "Leasing{" + "nifEmpresa=" + nifEmpresa + ", nomEmpresa=" + nomEmpresa + '}';
    }

}
