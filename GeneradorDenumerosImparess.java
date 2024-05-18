import java.util.Scanner;

public class GeneradorDeNumerosImpares {
    private int numero;

    public GeneradorDeNumerosImpares(int numero) {
        this.numero = numero;
    }

    public void generarNumerosImpares() {
        System.out.println("Numeros impares desde 1 hasta " + numero + ":");
        int i = 1;
        while (i <= numero) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Por favor, ingresa un numero mayor a 10 y menor que 30: ");
            numero = scanner.nextInt();
        } while (numero <= 10 || numero >= 30);
        GeneradorDeNumerosImpares generador = new GeneradorDeNumerosImpares(numero);
        generador.generarNumerosImpares();
        scanner.close();
    }
}
