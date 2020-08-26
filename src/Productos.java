public class Productos {
    Cliente Id;
    int CuentaAhorro;
    int CuentaCorriente;
    int TCredito;
    int TDebito;
    int PrestamoBanco;

    public Productos(Cliente Id, int cuentaAhorro, int cuentaCorriente, int TCredito, int TDebito, int prestamoBanco) {
        this.Id = Id;
        this.CuentaAhorro = cuentaAhorro;
        this.CuentaCorriente = cuentaCorriente;
        this.TCredito = TCredito;
        this.TDebito = TDebito;
        this.PrestamoBanco = prestamoBanco;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "IDCliente=" + Id +
                ", CuentaAhorro=" + CuentaAhorro +
                ", CuentaCorriente=" + CuentaCorriente +
                ", TCredito=" + TCredito +
                ", TDebito=" + TDebito +
                ", PrestamoBanco=" + PrestamoBanco +
                '}';
    }
}
