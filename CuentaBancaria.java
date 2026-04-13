public class CuentaBancaria {
    // Atributos privados
    private String nombreTitular;
    private double saldo;

    // Constructor público
    public CuentaBancaria(String nombreTitular, double saldoInicial) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldoInicial;
    }

    //metodo mostrar informacion 
    public void mostrarInformacion() {
        System.out.println("Titular: " + nombreTitular);
        System.out.println("Saldo actual: $" + saldo);
        System.out.println("-------------------------");
    }


    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito realizado: $" + monto);
    }


    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro realizado: $" + monto);
        } else {
            System.out.println("Fondos insuficientes para retirar $" + monto);
        }
    }
}