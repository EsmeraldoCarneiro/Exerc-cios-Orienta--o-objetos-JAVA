class Pessoa {

    // Atributos da classe
    String nome;
    int idade;

    // Construtor da classe
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para exibir informações da pessoa
    public void exibirInfo(){
        System.out.print("  Nome: " + nome);
        
        System.out.print("  Idade: " + idade);
    }
}


