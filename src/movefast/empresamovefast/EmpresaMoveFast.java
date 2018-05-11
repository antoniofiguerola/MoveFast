package movefast.empresamovefast;

/**
 *
 * @author Informatica
 */
public class EmpresaMoveFast {

    //Atributs
    String nom;
    int telefon;
    String direccio;
    String contacte;

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

    public void alta() {

    }

    public void modificacio() {

    }

    public void crearVehicle() {

    }

    public void crearLloguer() {

    }

    public void crearEmpresaLeasing() {

    }

    public void crearClient() {

    }

    public void consultarVehicles() {

    }

    public void obtenirDades() {

    }

    public void entregarVehicle() {

    }

    public void retirarVehicle() {

    }
}
