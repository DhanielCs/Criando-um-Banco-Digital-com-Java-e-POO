public class Banco {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Alice", 500.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Bob");

        // Testando operações
        contaCorrente.depositar(1000);
        contaCorrente.sacar(200);
        contaCorrente.transferir(300, contaPoupanca);

        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());

        // Testando limites de saque
        contaCorrente.sacar(1000); // Deve ser permitido devido ao limite
        contaCorrente.sacar(500);   // Deve falhar por saldo insuficiente
    }
}