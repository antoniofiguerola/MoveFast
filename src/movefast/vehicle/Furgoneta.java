package movefast.vehicle;

/**
 *
 * @author Informatica
 */
public class Furgoneta extends Vehicle {

    //Atributs
    private boolean cargaSuperior;

    public Furgoneta(boolean cargaSuperior, String matricula, String bastidor, String marca, String model, int numeroPlaces, double preuDia) {
        super(matricula, bastidor, marca, model, numeroPlaces, preuDia);
        this.cargaSuperior = cargaSuperior;
    }

    public boolean isCargaSuperior() {
        return cargaSuperior;
    }

    public void setCargaSuperior(boolean cargaSuperior) {
        this.cargaSuperior = cargaSuperior;
    }

    @Override
    public String toString() {
        return "Furgoneta{" + "cargaSuperior=" + cargaSuperior + '}';
    }

    public Furgoneta(String matricula, String bastidor, String marca, String model, int numeroPlaces, double preuDia) {
        super(matricula, bastidor, marca, model, numeroPlaces, preuDia);
    }

    //Atributs
}
