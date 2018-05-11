package movefast.client;

/**
 *
 * @author Informatica
 */
public class Casual extends Client {

    //Atributs
    private int idContracte;
    private double preu;

    public Casual(int idContracte, double preu, int id, String nom, String cognom, String DNI, String direccio, int telefon) {
        super(id, nom, cognom, DNI, direccio, telefon);
        this.idContracte = idContracte;
        this.preu = preu;
    }

    public int getIdContracte() {
        return idContracte;
    }

    public void setIdContracte(int idContracte) {
        this.idContracte = idContracte;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "Casual{" + "idContracte=" + idContracte + ", preu=" + preu + '}';
    }

}
