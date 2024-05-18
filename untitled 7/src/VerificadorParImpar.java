import java.util.Scanner;

public class VerificadorParImpar {
    private int numero;

    public VerificadorParImpar(int numero) {
        this.numero = numero;
    }

    public void verificarParImpar() {
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número entero: ");
        int numero = scanner.nextInt();
        VerificadorParImpar verificador = new VerificadorParImpar(numero);
        verificador.verificarParImpar();
        scanner.close();
    }
}
