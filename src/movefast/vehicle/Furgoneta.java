package movefast.vehicle;

/**
 *
 * @author Informatica
 */
public class Furgoneta extends Vehicle {

    //Atributs
    protected boolean cargaSuperior;

    //constructor
    public Furgoneta(String matricula, String bastidor, String marca, String model, int numeroPlaces, double preuDia, boolean cargaSuperior) {
        super(matricula, bastidor, marca, model, numeroPlaces, preuDia);
        this.cargaSuperior = cargaSuperior;
    }

    //Getters i Setters
    public boolean isCargaSuperior() {
        return cargaSuperior;
    }

    public void setCargaSuperior(boolean cargaSuperior) {
        this.cargaSuperior = cargaSuperior;
    }

    @Override
    public String toString() {
        return super.toString() + " amb cargaSuperior " + cargaSuperior;
    }

}
