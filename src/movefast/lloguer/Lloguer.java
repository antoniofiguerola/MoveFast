package movefast.lloguer;

import java.util.Date;

/**
 *
 * @author Informatica
 */
public class Lloguer {
    // per fer format Date haurem de fer un import aqui adalt (ja fet)
    //Atributs
    
    int id;
    double preu;
    Date dataInici;
    Date dataFi;

    public Lloguer(int id, double preu, Date dataInici, Date dataFi) {
        this.id = id;
        this.preu = preu;
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
        return "Lloguer{" + "id=" + id + ", preu=" + preu + ", dataInici=" + dataInici + ", dataFi=" + dataFi + '}';
    }
    
    
    
}
