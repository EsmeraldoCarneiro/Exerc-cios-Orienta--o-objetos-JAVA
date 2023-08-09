import java.util.Scanner;

public class TesteContaBancaria {
    public static void main(String[] args) {
        /*ContaBancaria conta = new ContaBancaria("João");
        
        conta.depositar(100.0);
        conta.sacar(50.0);
        conta.exibirInfo();*/
        
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário o nome do titular da conta
        System.out.print("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();
        
        // Cria um objeto ContaBancaria com o titular fornecido
        ContaBancaria conta = new ContaBancaria(nomeTitular);
        
        // Solicita ao usuário o valor a ser depositado na conta
        System.out.print("Digite o valor para depósito inicial: ");
        double valorDeposito = scanner.nextDouble();

        // Realiza o depósito na conta
        conta.depositar(valorDeposito);
        
        // Solicita ao usuário o valor a ser sacado da conta
        System.out.print("Digite o valor para saque: ");
        double valorSaque = scanner.nextDouble();

        // Realiza o saque na conta
        conta.sacar(valorSaque);
        

        // Exibe informações da conta após as operações
        System.out.println("Informações da conta:");
        conta.exibirInfo();
        

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
    
