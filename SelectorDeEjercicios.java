import java.util.Scanner;

public class SelectorDeEjercicios {
    private int opcion;

    public SelectorDeEjercicios(int opcion) {
        this.opcion = opcion;
    }

    public void seleccionarEjercicio() {
        switch (opcion) {
            case 1:
                mayorDeEdad();
                break;
            case 2:
                compararNumeros();
                break;
            case 3:
                parOImpar();
                break;
            case 4:
                factorial();
                break;
            case 5:
                numerosImpares();
                break;
            case 6:
                numerosImparesWhile();
                break;
            case 7:
                diaSemana();
                break;
            default:
                System.out.println("Opción no válida. Por favor ingresa un número del 1 al 7.");
                break;
        }
    }

    private void mayorDeEdad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa tu edad: ");
        int edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }
        scanner.close();
    }

    private void compararNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Por favor, ingresa el segundo número: ");
        int numero2 = scanner.nextInt();
        if (numero1 > numero2) {
            System.out.println("El primer número (" + numero1 + ") es mayor que el segundo número (" + numero2 + ").");
        } else if (numero2 > numero1) {
            System.out.println("El segundo número (" + numero2 + ") es mayor que el primer número (" + numero1 + ").");
        } else {
            System.out.println("Ambos números son iguales.");
        }
        scanner.close();
    }

    private void parOImpar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número entero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
        scanner.close();
    }

    private void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número: ");
        int numero = scanner.nextInt();
        long factorial = 1;
        int i = 1;
        while (i <= numero) {
            factorial *= i;
            i++;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
        scanner.close();
    }

    private void numerosImpares() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Por favor, ingresa un número mayor a 10 y menor que 30: ");
            numero = scanner.nextInt();
        } while (numero <= 10 || numero >= 30);
        System.out.println("Números impares desde 1 hasta " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }

    private void numerosImparesWhile() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Por favor, ingresa un número mayor a 10 y menor que 30: ");
            numero = scanner.nextInt();
        } while (numero <= 10 || numero >= 30);
        System.out.println("Números impares desde 1 hasta " + numero + ":");
        int i = 1;
        while (i <= numero) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
        scanner.close();
    }

    private void diaSemana() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número del 1 al 5: ");
        int numero = scanner.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Número inválido. Por favor ingresa un número del 1 al 5.");
                break;
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona un ejercicio:");
        System.out.println("1. Mayor de Edad");
        System.out.println("2. Comparar Números");
        System.out.println("3. Par o Impar");
        System.out.println("4. Factorial");
        System.out.println("5. Números Impares (for)");
        System.out.println("6. Números Impares (while)");
        System.out.println("7. Día de la Semana");
        System.out.print("Ingresa el número de ejercicio que deseas ejecutar: ");
        int opcion = scanner.nextInt();
        SelectorDeEjercicios selector = new SelectorDeEjercicios(opcion);
        selector.seleccionarEjercicio();
        scanner.close();
    }
}
assistant''
        Por supuesto, puedo ayudarte a convertir este programa a un estilo de programación orientada a objetos en Java. Podríamos crear una clase `SelectorDeEjercicios` que tenga métodos para cada uno de los ejercicios y un método para seleccionar y ejecutar el ejercicio deseado. Aquí está el código modificado:

        ```java
import java.util.Scanner;

public class SelectorDeEjercicios {
    private int opcion;

    public SelectorDeEjercicios(int opcion) {
        this.opcion = opcion;
    }

    public void seleccionarEjercicio() {
        switch (opcion) {
            case 1:
                mayorDeEdad();
                break;
            case 2:
                compararNumeros();
                break;
            case 3:
                parOImpar();
                break;
            case 4:
                factorial();
                break;
            case 5:
                numerosImpares();
                break;
            case 6:
                numerosImparesWhile();
                break;
            case 7:
                diaSemana();
                break;
            default:
                System.out.println("Opción no válida. Por favor ingresa un número del 1 al 7.");
                break;
        }
    }

    private void mayorDeEdad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa tu edad: ");
        int edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }
        scanner.close();
    }

    private void compararNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Por favor, ingresa el segundo número: ");
        int numero2 = scanner.nextInt();
        if (numero1 > numero2) {
            System.out.println("El primer número (" + numero1 + ") es mayor que el segundo número (" + numero2 + ").");
        } else if (numero2 > numero1) {
            System.out.println("El segundo número (" + numero2 + ") es mayor que el primer número (" + numero1 + ").");
        } else {
            System.out.println("Ambos números son iguales.");
        }
        scanner.close();
    }

    private void parOImpar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número entero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
        scanner.close();
    }

    private void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número: ");
        int numero = scanner.nextInt();
        long factorial = 1;
        int i = 1;
        while (i <= numero) {
            factorial *= i;
            i++;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
        scanner.close();
    }

    private void numerosImpares() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Por favor, ingresa un número mayor a 10 y menor que