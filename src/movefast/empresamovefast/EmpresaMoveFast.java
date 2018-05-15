package movefast.empresamovefast;

import java.util.ArrayList;
import java.util.HashMap;
import movefast.client.*;
import movefast.empresaleasing.EmpresaLeasing;
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
    private HashMap<String, Vehicle> vehicles = new HashMap<String, Vehicle>();
    private HashMap<String, Client> clients = new HashMap<String, Client>();
    private ArrayList<Lloguer> lloguers = new ArrayList<Lloguer>();
    private HashMap<String, EmpresaLeasing> empLeasing = new HashMap<String, EmpresaLeasing>();

    public EmpresaMoveFast(String nom, int telefon, String direccio, String contacte) {
        this.nom = nom;
        this.telefon = telefon;
        this.direccio = direccio;
        this.contacte = contacte;
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
    
    public Lloguer consultarLloguer(double preu) {
        Lloguer lloguer = null;
        for (Lloguer llo : lloguers) {
            if (preu == llo.getPreu()) {
                lloguer = llo;
            }
        }
        return lloguer;
    }

    public EmpresaLeasing consultarEmpresaLeasing(String nom) {
        return empLeasing.get(nom);
    }

    public void eliminarVehicle(String matricula) {//quin parametre li pas?!
//        si matricula esta dins vehicle es borra. Pasar un parametre o dos?!
    }
    
    public void eliminarClient(String dni) {//quin parametre li pas?!
//        si dni esta dins client es borra. Pasar un parametre o dos?!
    }

    public void obtenirDades() {

    }

    public void entregarVehicle() {

    }

    public void retirarVehicle() {

    }
}
