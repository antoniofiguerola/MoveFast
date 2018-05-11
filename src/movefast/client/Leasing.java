package movefast.client;

/**
 *
 * @author Informatica
 */
public class Leasing extends Client {

    //Atributs
    private String nifEmpresa;
    private String nomEmpresa;

    public Leasing(String nifEmpresa, String nomEmpresa, int id, String nom, String cognom, String DNI, String direccio, int telefon) {
        super(id, nom, cognom, DNI, direccio, telefon);
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
