import java.util.Scanner;

public class VerificadorDeMayorEdad {
    private int edad;

    public VerificadorDeMayorEdad(int edad) {
        this.edad = edad;
    }

    public void verificarMayorEdad() {
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa tu edad: ");
        int edad = scanner.nextInt();
        VerificadorDeMayorEdad verificador = new VerificadorDeMayorEdad(edad);
        verificador.verificarMayorEdad();
        scanner.close();
    }
}
