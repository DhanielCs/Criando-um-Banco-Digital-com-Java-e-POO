class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String titular, double limite) {
        super(titular);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && (getSaldo() + limite) >= valor) {
            super.sacar(valor);
        } else {
            System.out.println("Saque inválido. Saldo insuficiente ou valor inválido.");
        }
    }
}

