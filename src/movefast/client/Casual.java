package movefast.client;

/**
 *
 * @author Informatica
 */
public class Casual extends Client {

    //Atributs
    protected String tipusPagament; //fer enum

    //constructor
    public Casual(String nom, String cognom, String dni, String direccio, int telefon, String tipusPagament) {
        super(nom, cognom, dni, direccio, telefon);
        this.tipusPagament = tipusPagament;
    }

    public String getTipusPagament() {
        return tipusPagament;
    }

    public void setTipusPagament(String tipusPagament) {
        this.tipusPagament = tipusPagament;
    }

    @Override
    public String toString() {
        return super.toString() + "Casual{" + "tipusPagament=" + tipusPagament + '}';
    }

}
