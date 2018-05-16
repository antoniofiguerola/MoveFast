package movefast.lloguer;

import java.time.LocalDate;
import java.util.ArrayList;
import movefast.client.*;
import movefast.vehicle.*;

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

    public Lloguer(double preu, LocalDate dataInici, LocalDate dataFi, Vehicle vehicle, Client client) {
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

    public ArrayList<Lloguer> consultaLloguerClient(Client client) {
        ArrayList<Lloguer> lloguersClient = new ArrayList<Lloguer>();

        for (int i = 0; i < lloguersClient.size(); i++) {
            System.out.println(lloguersClient.get(i));

        }
        return lloguersClient;
    }

    @Override
    public String toString() {
        return "Lloguer{" + "dataInici=" + dataInici + ", dataFi=" + dataFi + ", vehicle=" + vehicle + ", client=" + client + '}';
    }

}
