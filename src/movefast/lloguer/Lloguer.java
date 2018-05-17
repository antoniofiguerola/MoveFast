package movefast.lloguer;

import java.time.LocalDate;
import java.util.ArrayList;
import movefast.client.*;
import movefast.vehicle.*;
import movefast.empresamovefast.*;

/**
 *
 * @author Informatica
 */
public class Lloguer {

    //Atributs    
    protected LocalDate dataInici;
    protected LocalDate dataFi;
    protected Vehicle vehicle;
    protected Client client;

    public Lloguer(LocalDate dataInici, LocalDate dataFi, Vehicle vehicle, Client client) {
        
        this.dataInici = dataInici;
        this.dataFi = dataFi;
        this.vehicle = vehicle;
        this.client = client;
    }

    //Getters i Setters
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

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Client getClient() {
        return client;
    }

    

    @Override
    public String toString() {
        return "Lloguer{" + "dataInici=" + dataInici + ", dataFi=" + dataFi + ", vehicle=" + vehicle + ", client=" + client + '}';
    }

}
