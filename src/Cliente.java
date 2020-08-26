import java.*;
import java.util.Scanner;

public class Cliente {
    int Id, NumCuenta;
    String Nombre, Apellidos, Celular, Direccion;



    public Cliente(int Id, String nombre, String apellidos, String celular, String direccion) {
        this.Id = Id;
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.Celular = celular;
        this.Direccion = direccion;

    }






    public void CrearCuentaAhorros(int Id, int NumCuenta){
        Cliente CLIENTE = new Cliente(Id, "Juan","Torres","1005","Calle 45");
        Productos CA = new Productos(CLIENTE,NumCuenta,0,0,0,0);
        System.out.println("Cuenta Creada Correctamente");
        System.out.println("ID Cliente ="+CA.Id.Id);
        System.out.println("Nombre " + CA.Id.Nombre);
        System.out.println("Apellido " + CA.Id.Apellidos);
        System.out.println("# Cuenta :" + CA.CuentaAhorro);

    }

    public void CrearCuentaCorriente(int Id, int NumCuenta){
        Cliente CLIENTE1 = new Cliente(Id, "Juan","Torres","1005","Calle 45");
        Productos CC = new Productos(CLIENTE1,0,NumCuenta,0,0,0);
        System.out.println("Cuenta Corriente Creada Correctamente");
        System.out.println("ID Cliente ="+CC.Id.Id);
        System.out.println("Nombre " + CC.Id.Nombre);
        System.out.println("Apellido " + CC.Id.Apellidos);
        System.out.println("# Cuenta :" + CC.CuentaCorriente);

    }








}
