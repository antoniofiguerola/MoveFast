/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movefast;

import java.text.SimpleDateFormat;
import java.util.Date;
import movefast.empresamovefast.*;
import movefast.lloguer.*;
import movefast.vehicle.*;
import movefast.client.*;
import movefast.empresaleasing.*;

/**
 *
 * @author Informatica
 */
public class Proves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EmpresaMoveFast emp = new EmpresaMoveFast("MoveFast", 971971971, "Inca", "abc@abc.com");
        Cotxe cotxe1 = new Cotxe("1234abc", "123456789", "Peugeot", "308", 5, 80.00, 5);
        Cotxe cotxe2 = new Cotxe("4567def", "987654321", "Citroen", "C4 Picasso", 5, 70.00, 5);
        Client cli1 = new Client("Antonio", "Figuerola", "43135006R", "Ca meva", 971971971);
        Client cli2 = new Client("Marc", "Grossi", "12345678A", "Can Grossi", 871871871);
        Client cli3 = new Client("Miquel", "Arrom", "87654321B", "Can Miquel", 671671671);
        EmpresaLeasing empLea1 = new EmpresaLeasing("Empresa", "Ca s'Empresa", 971971971, "empresa@empresa.cat");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date datainici = new Date();
        Date datafi = new Date();
        try {
            datainici = sdf.parse("16/05/2018");
            datafi = sdf.parse("20/05/2018");
        } catch (Exception e) {
            System.out.println("Fecha inici / fi introduida no es correcte");
            return;
        }
        Lloguer lloguer1 = new Lloguer(50, datainici, datafi, cotxe1, cli1);
        // ------------------------------------------------------------------
        emp.crearVehicle(cotxe1);
//        System.out.println(emp.consultarVehicle("1234abc"));
        emp.crearVehicle(cotxe2);
        System.out.println(emp.consultarVehicle("1234abc"));
        emp.crearClient(cli1);
        emp.crearClient(cli2);
        emp.crearClient(cli3);
        System.out.println(emp.consultarClient("12345678A"));
        emp.crearEmpresaLeasing(empLea1);
        System.out.println(emp.consultarEmpresaLeasing("Empresa"));
        emp.crearLloguer(lloguer1);
        System.out.println(emp.consultarLloguer(50.0));

    }

}
