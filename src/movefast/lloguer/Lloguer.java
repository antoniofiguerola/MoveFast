package movefast.lloguer;

import java.time.LocalDate;
import movefast.client.*;
import movefast.vehicle.*;

/**
 *
 * @author Informatica
 */
public class Lloguer {

    //Atributs    
    protected double preu;
    protected LocalDate dataInici;
    protected LocalDate dataFi;
    protected Vehicle vehicle;
    protected Client client;

    public Lloguer(double preu, LocalDate dataInici, LocalDate dataFi, Vehicle vehicle, Client client) {
        this.preu = preu;
        this.dataInici = dataInici;
        this.dataFi = dataFi;
        this.vehicle = vehicle;
        this.client = client;
    }

    //Getters i Setters
    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public LocalDate getDataInici() {
        return dataInici;
    }

    public void setDataInici(LocalDate dataInici) {
        this.dataInici = dataInici;
    }

    public LocalDate getDataFi() {
        return dataFi;
    }

    public void setDataFi(LocalDate dataFi) {
        this.dataFi = dataFi;
    }

    @Override
    public String toString() {
        return "Lloguer{" + "preu=" + preu + ", dataInici=" + dataInici + ", dataFi=" + dataFi + ", vehicle=" + vehicle + ", client=" + client + '}';
    }

}
