import org.junit.Test;

import static org.junit.Assert.*;
import java.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ClienteTest {


    @Test
    public void CrearCuentaAhorros(){
         int Id =1;
         int Numcuenta = 12345678;
        Cliente CLIENTE = new Cliente(Id, "Juan","Torres","1005","Calle 45");
        Productos CA = new Productos(CLIENTE,Numcuenta,0,0,0,0);
        System.out.println("Cuenta de Ahorros Creada Correctamente");
        System.out.println("ID Cliente ="+CA.Id.Id);
        System.out.println("Nombre " + CA.Id.Nombre);
        System.out.println("Apellido " + CA.Id.Apellidos);
        System.out.println("# Cuenta :" + CA.CuentaAhorro);
        assertEquals(CA.Id.Id,1,0);
        assertEquals(CA.CuentaAhorro,12345678,0);
    }

    @Test
    public void CrearCuentaCorriente(){
        int Id =2;
        int Numcuenta = 121345687;
        Cliente CLIENTE1 = new Cliente(Id, "Juan","Torres","1005","Calle 45");
        Productos CC = new Productos(CLIENTE1,0,Numcuenta,0,0,0);
        System.out.println("Cuenta Corriente Creada Correctamente");
        System.out.println("ID Cliente ="+CC.Id.Id);
        System.out.println("Nombre " + CC.Id.Nombre);
        System.out.println("Apellido " + CC.Id.Apellidos);
        System.out.println("# Cuenta :" + CC.CuentaCorriente);
        assertEquals(CC.Id.Id,2,0);
        assertEquals(CC.CuentaCorriente,121345687,0);
    }

}