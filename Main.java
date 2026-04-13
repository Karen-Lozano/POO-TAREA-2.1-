public class Main {
    public static void main(String[] args) {

        // Crear objeto
        CuentaBancaria cuenta1 = new CuentaBancaria("Lucía", 100.0);

        // Mostrar información inicial
        cuenta1.mostrarInformacion();

        // Depositar dinero
        cuenta1.depositar(50.0);
        cuenta1.mostrarInformacion();

        // Retirar dinero
        cuenta1.retirar(30.0);
        cuenta1.mostrarInformacion();
    }
}