package movefast.vehicle;

/**
 *
 * @author Informatica
 */
public class Motocicleta extends Vehicle {

    //Atributs
    protected int cilindrada;
    protected String tipusCarnet;

    //constructor
    public Motocicleta(int cilindrada, String tipusCarnet, String matricula, String bastidor, String marca, String model, int numeroPlaces, double preuDia) {
        super(matricula, bastidor, marca, model, numeroPlaces, preuDia);
        this.cilindrada = cilindrada;
        this.tipusCarnet = tipusCarnet;
    }

    //Getters i Setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipusCarnet() {
        return tipusCarnet;
    }

    public void setTipusCarnet(String tipusCarnet) {
        this.tipusCarnet = tipusCarnet;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "cilindrada=" + cilindrada + ", tipusCarnet=" + tipusCarnet + '}';
    }

}
