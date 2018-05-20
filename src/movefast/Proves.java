/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movefast;

import java.time.LocalDate;
import java.util.logging.*;
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
            Cotxe cotxe1 = new Cotxe("1234abc", "123456789", "Peugeot", "308", 5, 80.00, 5);
            Cotxe cotxe2 = new Cotxe("4567def", "987654321", "Citroen", "C4 Picasso", 5, 70.00, 5);
            Cotxe cotxe3 = new Cotxe("1235abc", "223456789", "Peugeot", "308", 5, 80.00, 5);
            Cotxe cotxe4 = new Cotxe("4568def", "887654321", "Citroen", "C4 Picasso", 5, 70.00, 5);
            Motocicleta moto1 = new Motocicleta("2345sdf", "345678912", "Suzuki", "Ninja", 2, 20.0, 800, "C1");
            Motocicleta moto2 = new Motocicleta("2346sdf", "445678912", "Suzuki", "Ninja", 2, 20.0, 800, "C1");
            Motocicleta moto3 = new Motocicleta("2347sdf", "545678912", "Suzuki", "Ninja", 2, 20.0, 800, "C1");
            Furgoneta furgo1 = new Furgoneta("9876zxy", "147258369", "Mercedes", "Van", 5, 90.0, true);
            Furgoneta furgo2 = new Furgoneta("9875zxy", "147258368", "Mercedes", "Van", 5, 90.0, true);
            Furgoneta furgo3 = new Furgoneta("9874zxy", "147258367", "Mercedes", "Van", 5, 90.0, true);
            Camio camio1 = new Camio("1357AGH", "135791357", "IVECO", "Superior", 3, 150.00, 12, 12000);
            Camio camio2 = new Camio("1358AGH", "135791358", "IVECO", "Superior", 3, 150.00, 12, 12000);
            Camio camio3 = new Camio("1359AGH", "135791359", "IVECO", "Superior", 3, 150.00, 12, 12000);
            Casual cli1 = new Casual("Antonio", "Figuerola", "43135006R", "Ca meva", 971971971, TipusPagament.COMPTAT);
            Casual cli2 = new Casual("Marc", "Grossi", "12345678A", "Can Grossi", 871871871, TipusPagament.TARJETACREDIT);
            Casual cli3 = new Casual("Miquel", "Arrom", "87654321B", "Can Miquel", 671671671, TipusPagament.TARJETADEBIT);
            Casual cli4 = new Casual("Miquel2", "Arrom", "97654321B", "Can Miquel", 671671672, TipusPagament.TARJETADEBIT);
            Casual cli5 = new Casual("Marc2", "Grossi", "22345678A", "Can Grossi", 871871872, TipusPagament.TARJETACREDIT);
            Casual cli6 = new Casual("Antonio2", "Figuerola", "53135006R", "Ca meva", 971971972, TipusPagament.COMPTAT);
            EmpresaLeasing empLea1 = new EmpresaLeasing("Empresa Toni", "Ca'n Toni", 971971971, "toni@empresa.cat");
            EmpresaLeasing empLea2 = new EmpresaLeasing("Empresa Miquel", "Ca'n Miquel", 971971972, "miquel@empresa.cat");
            EmpresaLeasing empLea3 = new EmpresaLeasing("Empresa Marc", "Ca'n Marc", 971971973, "marc@empresa.cat");
            Leasing clil1 = new Leasing("Toni", "Figuerola", "15935746Z", "Direccio", 951357468, empLea1);
            Leasing clil2 = new Leasing("Miquel", "Arrom", "25935746Z", "Direccio", 951357467, empLea2);
            Leasing clil3 = new Leasing("Marc", "Grossi", "35935746Z", "Direccio", 951357466, empLea3);
            Lloguer lloguer1 = new Lloguer(LocalDate.of(2018, 5, 23), LocalDate.of(2018, 5, 25), cotxe1, cli1);
            Lloguer lloguer2 = new Lloguer(LocalDate.of(2018, 5, 26), LocalDate.of(2018, 5, 28), moto1, cli2);
            Lloguer lloguer3 = new Lloguer(LocalDate.of(2018, 6, 1), LocalDate.of(2018, 6, 3), furgo1, cli3);
            Lloguer lloguer4 = new Lloguer(LocalDate.of(2018, 6, 4), LocalDate.of(2018, 6, 6), camio1, clil1);
            Lloguer lloguer5 = new Lloguer(LocalDate.of(2018, 6, 7), LocalDate.of(2018, 6, 9), cotxe2, clil2);
            Lloguer lloguer6 = new Lloguer(LocalDate.of(2018, 6, 10), LocalDate.of(2018, 6, 12), cotxe3, clil3);
            // ------------------------------------------------------------------
            emp.crearVehicle(cotxe1);
            emp.crearVehicle(cotxe2);
            emp.crearVehicle(cotxe3);
            emp.crearVehicle(cotxe4);
            emp.crearVehicle(moto1);
            emp.crearVehicle(moto2);
            emp.crearVehicle(moto3);
            emp.crearVehicle(furgo1);
            emp.crearVehicle(furgo2);
            emp.crearVehicle(furgo3);
            emp.crearVehicle(camio1);
            emp.crearVehicle(camio2);
            emp.crearVehicle(camio3);
            emp.crearClient(cli1);
            emp.crearClient(cli2);
            emp.crearClient(cli3);
            emp.crearClient(cli4);
            emp.crearClient(cli5);
            emp.crearClient(cli6);
            emp.crearClient(clil1);
            emp.crearClient(clil2);
            emp.crearClient(clil3);
            emp.crearEmpresaLeasing(empLea1);
            emp.crearEmpresaLeasing(empLea2);
            emp.crearEmpresaLeasing(empLea3);
            emp.crearLloguer(lloguer1);
            emp.crearLloguer(lloguer2);
            emp.crearLloguer(lloguer3);
            emp.crearLloguer(lloguer4);
            emp.crearLloguer(lloguer5);
            emp.crearLloguer(lloguer6);
            //        emp.consultarVehiclesDisponibles(moto1 ,LocalDate.of(2018, 5, 22), LocalDate.of(2018, 6, 13));
            //        emp.eliminarEmpresaLeasing("Empresa3");
            //        System.out.println(emp.consultarLloguer(50.0));
            //        emp.eliminarVehicle("4567def");
            //        emp.eliminarClient("97654321B");
            //        System.out.println(emp.consultarVehicle("1358AGH"));
            //        System.out.println(emp.consultarClient("87654321B"));
            //        emp.mostraVehicles();
            //        emp.mostraClients();
            //        System.out.println(emp.consultarClient("12345678A"));
            //        System.out.println(emp.consultarEmpresaLeasing("Empresa Miquel"));
                    System.out.println(emp.consultarVehiclesDisponibles("Cotxe" ,LocalDate.of(2018, 5, 22), LocalDate.of(2018, 6, 13)));
            //        System.out.println(emp.consultaLloguerClient(clil3));
            //        System.out.println(emp.consultaLloguerEmpresa(empLea3));
            //        System.out.println(emp.consultarLloguer(LocalDate.of(2018, 5, 21), LocalDate.of(2018, 5, 24)));
            //        System.out.println("El preu del lloguer es : " + emp.calcularPreuLloguer(lloguer6));
        } catch (Exepcio ex) {
            System.out.println(ex.getMessage());
        }
    }

}
