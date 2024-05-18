import java.util.Scanner;

public class ComparadorDeNumeros {
    private int numero1;
    private int numero2;

    public ComparadorDeNumeros(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void compararNumeros() {
        if (numero1 > numero2) {
            System.out.println("El primer número (" + numero1 + ") es mayor que el segundo número (" + numero2 + ").");
        } else if (numero2 > numero1) {
            System.out.println("El segundo número (" + numero2 + ") es mayor que el primer número (" + numero1 + ").");
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Por favor, ingresa el segundo número: ");
        int numero2 = scanner.nextInt();
        ComparadorDeNumeros comparador = new ComparadorDeNumeros(numero1, numero2);
        comparador.compararNumeros();
        scanner.close();
    }
}
