package movefast.vehicle;

/**
 *
 * @author Informatica
 */
public class Cotxe extends Vehicle {

    //Atributs
    protected int passatgers;
    protected int numeroPortes;

    //constructor
    public Cotxe(int passatgers, int numeroPortes, String matricula, String bastidor, String marca, String model, int numeroPlaces, double preuDia) {
        super(matricula, bastidor, marca, model, numeroPlaces, preuDia);
        this.passatgers = passatgers;
        this.numeroPortes = numeroPortes;
    }

    //Getters i Setters
    public int getPassatgers() {
        return passatgers;
    }

    public void setPassatgers(int passatgers) {
        this.passatgers = passatgers;
    }

    public int getNumeroPortes() {
        return numeroPortes;
    }

    public void setNumeroPortes(int numeroPortes) {
        this.numeroPortes = numeroPortes;
    }

    @Override
    public String toString() {
        return "Cotxe{" + "passatgers=" + passatgers + ", numeroPortes=" + numeroPortes + '}';
    }

}
