package movefast.client;

/**
 *
 * @author Informatica
 */
public class Client {

    //Atributs
    private int id;
    private String nom;
    private String cognom;
    private String DNI;
    private String direccio;
    private int telefon;

    public Client(int id, String nom, String cognom, String DNI, String direccio, int telefon) {
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
        this.DNI = DNI;
        this.direccio = direccio;
        this.telefon = telefon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
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
        return "Client{" + "id=" + id + ", nom=" + nom + ", cognom=" + cognom + ", DNI=" + DNI + ", direccio=" + direccio + ", telefon=" + telefon + '}';
    }

}
