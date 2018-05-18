/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movefast;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import movefast.empresamovefast.*;
import movefast.lloguer.*;
import movefast.vehicle.*;
import movefast.client.*;
import movefast.empresaleasing.*;
import movefast.utilitats.*;

/**
 *
 * @author Informatica
 */
public class Proves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        try {
            EmpresaMoveFast emp = new EmpresaMoveFast("MoveFast", 971971971, "Inca", "abc@abc.com");
            Cotxe cotxe1 = new Cotxe("1234abc", "123456789", "Peugeot", "308", 5, 80.00,/* true,*/ 5);
            Cotxe cotxe2 = new Cotxe("4567def", "987654321", "Citroen", "C4 Picasso", 5, 70.00,/* true,*/ 5);
            Cotxe cotxe3 = new Cotxe("1235abc", "223456789", "Peugeot", "308", 5, 80.00,/* true,*/ 5);
            Cotxe cotxe4 = new Cotxe("4568def", "887654321", "Citroen", "C4 Picasso", 5, 70.00,/* true,*/ 5);
            Camio camio1 = new Camio("1357AGH", "13579", "IVECO", "Superior", 3, 150.00,/* true,*/ 12, 12000);
            Casual cli1 = new Casual("Antonio", "Figuerola", "43135006R", "Ca meva", 971971971, TipusPagament.COMPTAT);
            Casual cli2 = new Casual("Marc", "Grossi", "12345678A", "Can Grossi", 871871871, TipusPagament.TARJETACREDIT);
            Casual cli3 = new Casual("Miquel", "Arrom", "87654321B", "Can Miquel", 671671671, TipusPagament.TARJETADEBIT);
            Casual cli4 = new Casual("Miquel2", "Arrom", "97654321B", "Can Miquel", 671671671, TipusPagament.TARJETADEBIT);
            Casual cli5 = new Casual("Marc2", "Grossi", "22345678A", "Can Grossi", 871871871, TipusPagament.TARJETACREDIT);
            Casual cli6 = new Casual("Antonio2", "Figuerola", "53135006R", "Ca meva", 971971971, TipusPagament.COMPTAT);
            EmpresaLeasing empLea1 = new EmpresaLeasing("Empresa", "Ca s'Empresa", 971971971, "empresa@empresa.cat");
            EmpresaLeasing empLea2 = new EmpresaLeasing("Empresa2", "Ca s'Empresa", 971971971, "empresa@empresa.cat");
            EmpresaLeasing empLea3 = new EmpresaLeasing("Empresa3", "Ca s'Empresa", 971971971, "empresa@empresa.cat");
            Leasing clil1 = new Leasing("Andreu", "Apellido", "15935746Z", "Direccio", 951357468, empLea1);
            Leasing clil2 = new Leasing("Andreu2", "Apellido", "25935746Z", "Direccio", 951357468, empLea2);
            Leasing clil3 = new Leasing("Andreu3", "Apellido", "35935746Z", "Direccio", 951357468, empLea3);
            Lloguer lloguer1 = new Lloguer(LocalDate.of(2018, 5, 25), LocalDate.of(2018, 5, 27), cotxe2, cli3);
            Lloguer lloguer2 = new Lloguer(LocalDate.of(2018, 5, 21), LocalDate.of(2018, 5, 24), cotxe3, cli3);
            Lloguer lloguer3 = new Lloguer(LocalDate.of(2018, 5, 25), LocalDate.of(2018, 5, 29), camio1, clil1);
            // ------------------------------------------------------------------
            emp.crearVehicle(cotxe1);
            //        System.out.println(emp.consultarVehicle("1234abc"));
            emp.crearVehicle(cotxe2);
            emp.crearVehicle(cotxe3);
            emp.crearVehicle(cotxe4);
            emp.crearVehicle(camio1);
            //        System.out.println(emp.consultarVehicle("1234abc"));
            emp.crearClient(cli1);
            emp.crearClient(cli2);
            emp.crearClient(cli3);
            emp.crearClient(cli4);
            emp.crearClient(cli5);
            emp.crearClient(cli6);
            emp.crearClient(clil1);
            emp.crearClient(clil2);
            emp.crearClient(clil3);
            //        System.out.println(emp.consultarClient("12345678A"));
            emp.crearEmpresaLeasing(empLea1);
            emp.crearEmpresaLeasing(empLea2);
            emp.crearEmpresaLeasing(empLea3);
            //        System.out.println(emp.consultarEmpresaLeasing("Empresa"));
            emp.crearLloguer(lloguer1);
            emp.crearLloguer(lloguer2);
            emp.crearLloguer(lloguer3);
            //        System.out.println(emp.consultarLloguer(50.0));
            //        emp.eliminarVehicle("4567def");
            //        emp.eliminarClient("87654321B");
            //        System.out.println(emp.consultarVehicle("4567def"));
            //        System.out.println(emp.consultarClient("87654321B"));
            //        emp.mostraVehicles();
            //        emp.mostraClients();

            System.out.println(emp.consultaLloguerClient(cli3));
            System.out.println(emp.consultaLloguerEmpresa(empLea1));
            //        System.out.println(emp.consultarLloguer(LocalDate.of(2018, 5, 21), LocalDate.of(2018, 5, 24)));
            System.out.println("El preu del lloguer es : " + emp.calcularPreuLloguer(lloguer3));
        } catch (Exepcio ex) {
            System.out.println(ex.getMessage());
        }
    }

}
