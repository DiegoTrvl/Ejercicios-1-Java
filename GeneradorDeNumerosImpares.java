import java.util.Scanner;

public class GeneradorDeNumerosImpares {
    private int numero;

    public GeneradorDeNumerosImpares(int numero) {
        this.numero = numero;
    }

    public void generarNumerosImpares() {
        System.out.println("Números impares desde 1 hasta " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Por favor, ingresa un número mayor a 10 y menor que 30: ");
            numero = scanner.nextInt();
        } while (numero <= 10 || numero >= 30);
        GeneradorDeNumerosImpares generador = new GeneradorDeNumerosImpares(numero);
        generador.generarNumerosImpares();
        scanner.close();
    }
}
