package movefast.client;

/**
 *
 * @author Informatica
 */
public class Casual extends Client {

    //Atributs
    protected TipusPagament tipusPagament; //fer enum

    //constructor
    public Casual(String nom, String cognom, String dni, String direccio, int telefon, TipusPagament tipusPagament) {
        super(nom, cognom, dni, direccio, telefon);
        this.tipusPagament = tipusPagament;
    }

    public TipusPagament getTipusPagament() {
        return tipusPagament;
    }

    public void setTipusPagament(TipusPagament tipusPagament) {
        this.tipusPagament = tipusPagament;
    }

    @Override
    public String toString() {
        return super.toString() + "Casual{" + "tipusPagament=" + tipusPagament + '}';
    }

}
