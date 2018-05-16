package movefast.vehicle;

/**
 *
 * @author Informatica
 */
public abstract class Vehicle { //afegir abatract pq no volem crear objectes vehicle

    //Atributs
    protected String matricula;
    protected String bastidor;
    protected String marca;
    protected String model;
    protected int numeroPlaces;
    protected double preuDia;
    protected boolean disponible;

    //constructor
    public Vehicle(String matricula, String bastidor, String marca, String model, int numeroPlaces, double preuDia, boolean disponible) {
        this.matricula = matricula;
        this.bastidor = bastidor;
        this.marca = marca;
        this.model = model;
        this.numeroPlaces = numeroPlaces;
        this.preuDia = preuDia;
        this.disponible = disponible;
    }

    //Getters i Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumeroPlaces() {
        return numeroPlaces;
    }

    public void setNumeroPlaces(int numeroPlaces) {
        this.numeroPlaces = numeroPlaces;
    }

    public double getPreuDia() {
        return preuDia;
    }

    public void setPreuDia(double preuDia) {
        this.preuDia = preuDia;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "matricula=" + matricula + ", bastidor=" + bastidor + ", marca=" + marca + ", model=" + model + ", numeroPlaces=" + numeroPlaces + ", preuDia=" + preuDia + ", disponible=" + disponible + '}';
    }

}
