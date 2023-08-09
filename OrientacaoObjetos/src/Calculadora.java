class Calculadora {
    // Método estático para somar dois números
    public static double somar(double num1, double num2) {
        return num1 + num2;    
    }

    // Método estático para subtrair dois números
    public static double subtrair(double num1, double num2) {
            return num1 - num2;
    }

    // Método estático para multiplicar dois números
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Método estático para dividir dois números
    public static double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Erro: divisão por zero.");
            return Double.NaN; // NaN (Not-a-Number) representa um valor inválido
        }
    }
}

