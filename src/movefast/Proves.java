/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movefast;

import java.time.LocalDate;
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
        Cotxe cotxe1 = new Cotxe("1234abc", "123456789", "Peugeot", "308", 5, 80.00, true, 5);
        Cotxe cotxe2 = new Cotxe("4567def", "987654321", "Citroen", "C4 Picasso", 5, 70.00, true, 5);
        Camio camio1 = new Camio("1357AGH", "13579", "IVECO", "Superior", 3, 150.00, true, 12, 12000);
        Casual cli1 = new Casual("Antonio", "Figuerola", "43135006R", "Ca meva", 971971971, "Efectiu");
        Casual cli2 = new Casual("Marc", "Grossi", "12345678A", "Can Grossi", 871871871, "Efectiu");
        Casual cli3 = new Casual("Miquel", "Arrom", "87654321B", "Can Miquel", 671671671, "Efectiu");
        EmpresaLeasing empLea1 = new EmpresaLeasing("Empresa", "Ca s'Empresa", 971971971, "empresa@empresa.cat");
        Leasing clil1 = new Leasing("Andreu", "Apellido", "15935746Z", "Direccio", 951357468, empLea1);
        Lloguer lloguer1 = new Lloguer(50.0, LocalDate.of(2018, 5, 16), LocalDate.of(2018, 5, 20), cotxe2, cli3);
        // ------------------------------------------------------------------
        emp.crearVehicle(cotxe1);
//        System.out.println(emp.consultarVehicle("1234abc"));
        emp.crearVehicle(cotxe2);
        emp.crearVehicle(camio1);
        System.out.println(emp.consultarVehicle("1234abc"));
        emp.crearClient(cli1);
        emp.crearClient(cli2);
        emp.crearClient(cli3);
        emp.crearClient(clil1);
        System.out.println(emp.consultarClient("12345678A"));
        emp.crearEmpresaLeasing(empLea1);
        System.out.println(emp.consultarEmpresaLeasing("Empresa"));
        emp.crearLloguer(lloguer1);
//        System.out.println(emp.consultarLloguer(50.0));
//        emp.eliminarVehicle("4567def");
//        emp.eliminarClient("87654321B");
        System.out.println(emp.consultarVehicle("4567def"));
        System.out.println(emp.consultarClient("87654321B"));
        emp.mostraVehicles();
        emp.mostraClients();
    }

}
