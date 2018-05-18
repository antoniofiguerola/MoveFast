package movefast.lloguer;

import java.time.LocalDate;
import java.util.ArrayList;
import movefast.client.*;
import movefast.vehicle.*;
import movefast.empresamovefast.*;
import movefast.utilitats.*;

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

    public Lloguer(LocalDate dataInici, LocalDate dataFi, Vehicle vehicle, Client client) throws Exepcio {

//        this.dataInici = dataInici;
//        this.dataFi = dataFi;
//        this.vehicle = vehicle;
//        this.client = client;

        setDataInici(dataInici);
        setDataFi(dataFi);
        setVehicle(vehicle);
        setClient(client);
    }

    //Getters i Setters
    public LocalDate getDataInici() {
        return dataInici;
    }

    public void setVehicle(Vehicle vehicle) throws Exepcio {
        if (vehicle == null) {
            throw new Exepcio("El vehicle no potser null");
        }
        this.vehicle = vehicle;
    }

    public void setClient(Client client) throws Exepcio {
        if (client == null) {
            throw new Exepcio("El client no potser null");
        }
        this.client = client;
    }

    public void setDataInici(LocalDate dataInici) throws Exepcio {
        if (dataInici.isBefore(LocalDate.now()) || dataInici.isEqual(LocalDate.now())) {
            throw new Exepcio("La data no pot ser anterior o avui"+dataInici);
        }
        this.dataInici = dataInici;
    }

    public void setDataFi(LocalDate dataFi) throws Exepcio {
        if (dataFi.isBefore(dataInici)) {
            throw new Exepcio("La data no pot ser anterior o posterior a avui");
        }
        this.dataFi = dataFi;
    }

    public LocalDate getDataFi() {
        return dataFi;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Client getClient() {
        return client;
    }

@Override
    public String toString() {
        return "El Lloguer sol.licitat va des de " + dataInici + " fins a " + dataFi + " amb el vehicle " + vehicle + " perteneixent al client " + client + '}';
    }


}
