package movefast.client;

/**
 *
 * @author Informatica
 */
public class Casual extends Client {

    //Atributs
    protected TipusPagament tipusPagament; //empram enum

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
        return super.toString() + " es un tipus de client Casual que paga amb " + tipusPagament;
    }

}
