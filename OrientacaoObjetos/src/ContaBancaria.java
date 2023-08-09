class ContaBancaria {
    private String titular;
    private double saldo;

    // Construtor da classe
    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0.0;
    }

     // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Novo saldo: " + saldo);
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + "realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    // Método para exibir informações da conta
    public void exibirInfo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
