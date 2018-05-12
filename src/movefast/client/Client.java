package movefast.client;

/**
 *
 * @author Informatica
 */
public class Client {

    //Atributs
    protected String nom;
    protected String cognom;
    protected String dni;
    protected String direccio;
    protected int telefon;

    //constructor
    public Client(String nom, String cognom, String dni, String direccio, int telefon) {
        this.nom = nom;
        this.cognom = cognom;
        this.dni = dni;
        this.direccio = direccio;
        this.telefon = telefon;
    }

    //Getters i Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getDNI() {
        return dni;
    }

    public void setDNI(String dni) {
        this.dni = dni;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Client{" + "nom=" + nom + ", cognom=" + cognom + ", dni=" + dni + ", direccio=" + direccio + ", telefon=" + telefon + '}';
    }

}
