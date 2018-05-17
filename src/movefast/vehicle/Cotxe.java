package movefast.vehicle;

/**
 *
 * @author Informatica
 */
public class Cotxe extends Vehicle {

    //Atributs
    protected int numeroPortes;

    //constructor
    public Cotxe(String matricula, String bastidor, String marca, String model, int numeroPlaces, double preuDia,/* boolean disponible,*/ int numeroPortes) {
        super(matricula, bastidor, marca, model, numeroPlaces, preuDia/*, disponible*/);
        this.numeroPortes = numeroPortes;
    }

    //Getters i Setters
    public int getNumeroPortes() {
        return numeroPortes;
    }

    public void setNumeroPortes(int numeroPortes) {
        this.numeroPortes = numeroPortes;
    }

    @Override
    public String toString() {
        return super.toString() + " Cotxe{" + "numeroPortes=" + numeroPortes + '}';
    }

}
