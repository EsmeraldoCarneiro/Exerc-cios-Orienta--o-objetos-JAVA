public class TesteCalculadora {
    public static void main(String[] args) {
        double valor1 = 10.0;
        double valor2 = 5.0;
        
        System.out.println("Soma: " + Calculadora.somar(valor1, valor2));
        System.out.println("Subtração: " + Calculadora.subtrair(valor1, valor2));
        System.out.println("Multiplicação: " + Calculadora.multiplicar(valor1, valor2));
        System.out.println("Divisão: " + Calculadora.dividir(valor1, valor2));
    }
}