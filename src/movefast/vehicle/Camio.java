package movefast.vehicle;

/**
 *
 * @author Informatica
 */
public class Camio extends Vehicle {

    //Atributs
    private int longitud;
    private int pesTara;

    public Camio(int longitud, int pesTara, String matricula, String bastidor, String marca, String model, int numeroPlaces, double preuDia) {
        super(matricula, bastidor, marca, model, numeroPlaces, preuDia);
        this.longitud = longitud;
        this.pesTara = pesTara;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getPesTara() {
        return pesTara;
    }

    public void setPesTara(int pesTara) {
        this.pesTara = pesTara;
    }

    @Override
    public String toString() {
        return "Camio{" + "longitud=" + longitud + ", pesTara=" + pesTara + '}';
    }

    public Camio(String matricula, String bastidor, String marca, String model, int numeroPlaces, double preuDia) {
        super(matricula, bastidor, marca, model, numeroPlaces, preuDia);
    }

    //Atributs
}
