package movefast.client;

import movefast.empresaleasing.EmpresaLeasing;

/**
 *
 * @author Informatica
 */
public class Leasing extends Client {

    //Atributs
    protected EmpresaLeasing empresaLeasing;

    public Leasing(String nom, String cognom, String dni, String direccio, int telefon, EmpresaLeasing empresaLeasing) {
        super(nom, cognom, dni, direccio, telefon);
        this.empresaLeasing = empresaLeasing;
    }

    public EmpresaLeasing getEmpresaLeasing() {
        return empresaLeasing;
    }

    @Override
    public String toString() {
        return super.toString() + " i la empresa Leasin " + empresaLeasing;
    }

}
