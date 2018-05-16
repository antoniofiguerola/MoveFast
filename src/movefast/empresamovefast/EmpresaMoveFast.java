package movefast.empresamovefast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import movefast.client.*;
import movefast.empresaleasing.*;
import movefast.lloguer.*;
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

    public EmpresaMoveFast(String nom, int telefon, String direccio, String contacte) {
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
        return clients.values();// no ha de retornar aixo
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

    public void crearLloguer(Lloguer ll) {
        lloguers.add(ll);
    }

    public void crearEmpresaLeasing(EmpresaLeasing empLea) {
        empLeasing.put(empLea.getNom(), empLea);
    }

    public Vehicle consultarVehicle(String matricula) {
        return vehicles.get(matricula);
    }

    public Client consultarClient(String dni) {
        return clients.get(dni);
    }

//    public Lloguer consultarLloguer(double preu) {//metodo consultalloguerclient i consultarlloguerempresaleasing
//    
//    }

    public EmpresaLeasing consultarEmpresaLeasing(String nom) {
        return empLeasing.get(nom);
    }

    public void eliminarVehicle(String matricula) {
        if (vehicles.containsKey(matricula)) {
            vehicles.remove(matricula);
        }
    }

    public void eliminarClient(String dni) {
        if (clients.containsKey(dni)) {
            clients.remove(dni);
        }
    }

    public void obtenirDades(Client cli, Vehicle v) {
        // farem un import de Field
//        Field[] Clients = cli.getClass().getDeclaredFields();
//        for (Field field : Clients) {
//            try {
//                String fieldName = field.getName();
//                Object fieldValue = field.get(cli);
//                System.out.println(fieldName + ":" + fieldValue);
//            } catch (IllegalArgumentException | IllegalAccessException e) {
//                e.printStackTrace();
//            }
            cli.getNom();
            cli.getCognom();
            cli.getDNI();
            cli.getDireccio();
            cli.getTelefon();
            v.getBastidor();
            v.getMarca();
            v.getMatricula();
            v.getModel();
            v.getNumeroPlaces();
            v.getPreuDia();
        }

    public void entregarVehicle() {

    }

    public void retirarVehicle() {

    }

    public void mostraVehicles() {
        for (Map.Entry<String, Vehicle> entry : vehicles.entrySet()) {
            System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());
        }
        System.out.println("");
    }
    
    public void mostraClients() {
        for (Map.Entry<String, Client> entry : clients.entrySet()) {
            System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());
        }
        System.out.println("");
    }
//    para recorrer hashmap
//    for (Map.Entry<Integer, String> entry : datos.entrySet () ) {
//    System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());
//    }
    
}
