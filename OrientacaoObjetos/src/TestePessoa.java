public class TestePessoa {
    public static void main(String[] args) {
        // Criação de objetos da classe Pessoa
        Pessoa pessoa1 = new Pessoa("João", 30);
        Pessoa pessoa2 = new Pessoa("Maria",25);

        // Exibição das informações das pessoas
        pessoa1.exibirInfo();
        pessoa2.exibirInfo();
    }
}