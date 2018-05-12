package movefast.lloguer;

import java.util.Date;

/**
 *
 * @author Informatica
 */
public class Lloguer {
    // per fer format Date haurem de fer un import aqui adalt (ja fet)
    
    //Atributs    
    protected double preu;
    protected Date dataInici;
    protected Date dataFi;

    //constructor
    public Lloguer(double preu, Date dataInici, Date dataFi) {
        this.preu = preu;
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }

    //Getters i Setters
    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public Date getDataInici() {
        return dataInici;
    }

    public void setDataInici(Date dataInici) {
        this.dataInici = dataInici;
    }

    public Date getDataFi() {
        return dataFi;
    }

    public void setDataFi(Date dataFi) {
        this.dataFi = dataFi;
    }

    @Override
    public String toString() {
        return "Lloguer{" + "preu=" + preu + ", dataInici=" + dataInici + ", dataFi=" + dataFi + '}';
    }

}
