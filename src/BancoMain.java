import java.util.Scanner;

public class BancoMain {

    public static void main(String [] args){
        int Id, NumCuentaA, NumCuentaC;
        Scanner capture = new Scanner(System.in);
        System.out.println("Ingrese el Id del Cliente");
        Id=capture.nextInt();
        System.out.println("Ingrese el numero de cuenta de Ahorros");
        NumCuentaA = capture.nextInt();

        System.out.println("Ingrese el numero de cuenta Corriente");
        NumCuentaC = capture.nextInt();

        Cliente CLIENTE = new Cliente(Id, "Juan","Torres","1005","Calle 45");

        CLIENTE.CrearCuentaAhorros(Id,NumCuentaA);
        CLIENTE.CrearCuentaCorriente(Id,NumCuentaC);
    }


}
