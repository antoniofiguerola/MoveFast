package movefast.client;

/**
 *
 * @author Informatica
 */
public class Casual extends Client {

    //Atributs
    protected double preu;

    //constructor
    public Casual(double preu, String nom, String cognom, String dni, String direccio, int telefon) {
        super(nom, cognom, dni, direccio, telefon);
        this.preu = preu;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "Casual{" + "preu=" + preu + '}';
    }

}
