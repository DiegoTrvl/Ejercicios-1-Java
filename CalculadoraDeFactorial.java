import java.util.Scanner;

public class CalculadoraDeFactorial {
    private int numero;

    public CalculadoraDeFactorial(int numero) {
        this.numero = numero;
    }

    public long calcularFactorial() {
        long factorial = 1;
        int i = 1;
        while (i <= numero) {
            factorial *= i;
            i++;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número: ");
        int numero = scanner.nextInt();
        CalculadoraDeFactorial calculadora = new CalculadoraDeFactorial(numero);
        long factorial = calculadora.calcularFactorial();
        System.out.println("El factorial de " + numero + " es " + factorial);
        scanner.close();
    }
}
