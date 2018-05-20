package movefast.empresamovefast;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import movefast.client.*;
import movefast.empresaleasing.*;
import movefast.lloguer.*;
import movefast.utilitats.*;
import movefast.vehicle.*;

/**
 *
 * @author Informatica
 */
public class EmpresaMoveFast {

    //Atributs
    private String nom;
    private int telefon;
    private String direccio;
    private String contacte;
    private HashMap<String, Vehicle> vehicles;
    private HashMap<String, Client> clients;
    private ArrayList<Lloguer> lloguers;
    private HashMap<String, EmpresaLeasing> empLeasing;

    public EmpresaMoveFast(String nom, int telefon, String direccio, String contacte) throws Exepcio {
        this.nom = nom;
        this.telefon = telefon;
        this.direccio = direccio;
        this.contacte = contacte;
        vehicles = new HashMap<String, Vehicle>();
        clients = new HashMap<String, Client>();
        lloguers = new ArrayList<Lloguer>();
        empLeasing = new HashMap<String, EmpresaLeasing>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public String getContacte() {
        return contacte;
    }

    public void setContacte(String contacte) {
        this.contacte = contacte;
    }

    public Collection<Client> getClients() {
        return clients.values();
    }

    @Override
    public String toString() {
        return "EmpresaMoveFast{" + "nom=" + nom + ", telefon=" + telefon + ", direccio=" + direccio + ", contacte=" + contacte + '}';
    }

    public void crearVehicle(Vehicle v) {
        vehicles.put(v.getMatricula(), v);
    }

    public void crearClient(Client cli) {
        clients.put(cli.getDNI(), cli);
    }

    public void crearLloguer(Lloguer ll) throws Exepcio {
        if (consultarDisponibilitat(ll.getVehicle(), ll.getDataInici(), ll.getDataFi())) {
            lloguers.add(ll);
        } else {
            throw new Exepcio("El vehicle no esta disponible");
        }
    }

    public void crearEmpresaLeasing(EmpresaLeasing empLea) {
        empLeasing.put(empLea.getNom(), empLea);
    }

    public Vehicle consultarVehicle(String matricula) {
        return vehicles.get(matricula);
    }

    public ArrayList<Vehicle> consultarVehiclesDisponibles(String tipus, LocalDate dataInici, LocalDate dataFi) {
        ArrayList<Vehicle> vehiclesdisponibles = new ArrayList<Vehicle>();

        for (Vehicle vehicle : vehicles.values()) {
            if (tipus.equalsIgnoreCase("Cotxe")) {
                if (vehicle instanceof Cotxe) {
                    if (this.consultarDisponibilitat(vehicle, dataInici, dataFi)) {
                        vehiclesdisponibles.add(vehicle);
                    }
                }
            }

            if (tipus.equalsIgnoreCase("Motocicleta")) {
                if (vehicle instanceof Motocicleta) {
                    if (this.consultarDisponibilitat(vehicle, dataInici, dataFi)) {
                        vehiclesdisponibles.add(vehicle);
                    }
                }
            }

            if (tipus.equalsIgnoreCase("Furgoneta")) {
                if (vehicle instanceof Furgoneta) {
                    if (this.consultarDisponibilitat(vehicle, dataInici, dataFi)) {
                        vehiclesdisponibles.add(vehicle);
                    }
                }
            }

            if (tipus.equalsIgnoreCase("Camio")) {
                if (vehicle instanceof Camio) {
                    if (this.consultarDisponibilitat(vehicle, dataInici, dataFi)) {
                        vehiclesdisponibles.add(vehicle);
                    }
                }
            }

        }
        return vehiclesdisponibles;
    }

    public Client consultarClient(String dni) {
        return clients.get(dni);
    }

    public boolean consultarDisponibilitat(Vehicle v, LocalDate dataInici, LocalDate dataFi) {
        boolean disponible = true;

        for (Lloguer lloguer : lloguers) {

            if (lloguer.getVehicle().equals(v) && (!(dataInici.isAfter(lloguer.getDataFi()) || dataFi.isBefore(lloguer.getDataInici())))) {
                disponible = false;
                return disponible;
            }
        }
        return disponible;
    }

    public Lloguer consultarLloguer(LocalDate dataInici, LocalDate dataFi) {

        for (Lloguer lloguer : lloguers) {
            if (lloguer.getDataInici().equals(dataInici) && lloguer.getDataFi().equals(dataFi)) {
                return lloguer;
            }
        }
        return null;
    }

    public ArrayList<Lloguer> consultaLloguerClient(Client client) {
        ArrayList<Lloguer> lloguersClient = new ArrayList<Lloguer>();

        for (Lloguer lloguer : lloguers) {
            if (lloguer.getClient().equals(client)) {
                lloguersClient.add(lloguer);
            }
        }
        lloguersClient.sort((a, b) -> b.getDataInici().compareTo(a.getDataInici()));
        return lloguersClient;
    }

    public ArrayList<Lloguer> consultaLloguerEmpresa(EmpresaLeasing empLea) {
        ArrayList<Lloguer> lloguersEmpresa = new ArrayList<Lloguer>();

        for (Lloguer lloguer : lloguers) {
            if (lloguer.getClient() instanceof Leasing
                    && ((Leasing) lloguer.getClient()).getEmpresaLeasing().equals(empLea)) { //casting
                lloguersEmpresa.add(lloguer);
            }
        }
        lloguersEmpresa.sort((a, b) -> b.getDataInici().compareTo(a.getDataInici()));
        return lloguersEmpresa;
    }

    public EmpresaLeasing consultarEmpresaLeasing(String nom) {
        return empLeasing.get(nom);
    }

    public void eliminarVehicle(String matricula) {
        if (vehicles.containsKey(matricula)) {
            Vehicle vehicle = vehicles.get(matricula);
            if (vehicle != null) {
                for (Lloguer lloguer : lloguers) {
                    if (lloguer.getVehicle().equals(vehicle)) {
                        return;
                    }
                }
                vehicles.remove(matricula);
            }
        }
    }

    public void eliminarClient(String dni) {
        if (clients.containsKey(dni)) {
            Client client = clients.get(dni);
            if (client != null) {
                for (Lloguer lloguer : lloguers) {
                    if (lloguer.getClient().equals(client)) {
                        return;
                    }
                }
                clients.remove(dni);
            }
        }
    }

    public void eliminarEmpresaLeasing(String nom) {
        if (empLeasing.containsKey(nom)) {
            EmpresaLeasing empresaLeasing = empLeasing.get(nom);
            if (empresaLeasing != null) {
                for (Lloguer lloguer : lloguers) {
                    if (lloguer.getClient().equals(empresaLeasing)) {
                        return;
                    }
                }
                empLeasing.remove(nom);
            }
        }
    }

    public double calcularPreuLloguer(Lloguer ll) {
        long dies;
        double preu;
        double descompte;
        dies = ChronoUnit.DAYS.between(ll.getDataInici(), ll.getDataFi()) + 1;

        Vehicle v = ll.getVehicle();
        if (ll.getClient() instanceof Casual) {
            preu = dies * v.getPreuDia();
        } else {
            descompte = (dies * v.getPreuDia()) * 0.10;
            preu = (dies * v.getPreuDia()) - descompte;
        }
        return preu;
    }

}
