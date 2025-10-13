//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ejercicio1(20, 10);
        ejercicio2(10, 10);
        ejercicio3("Aythami");
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7(); //la contraseña es acierto123
        ejercicio8();
        ejercicio9();
    }

    private static void ejercicio1(int x, int y){
        System.out.println("\n Ejercicio 1:");
        System.out.println("La suma de las variables es: " + (x+y));
        System.out.println("La resta de las variables es: " + (x-y));
        System.out.println("La mulitplicación de las variables es: " + (x*y));
        System.out.println("La división de las variables es: " + (x/y));
    }
    private static void ejercicio2(int x, int y){
        System.out.println("\n Ejercicio 2:");
        if(x > y){
            System.out.println("la variable uno, " + x + " es mayor que la variable dos, " + y);
        }
        if(y > x){
            System.out.println("la variable dos, " + y + " es mayor que la variable uno, " + x);
        }
        if(x == y){
            System.out.println("las variables son iguales");
        }
    }
    private static void ejercicio3(String nombre){
        System.out.println("\n Ejercicio 3:");
        System.out.println("Bienvenido a clase, " + nombre);
    }
    private static void ejercicio4(){
        System.out.println("\n Ejercicio 4:");
        int count = 0;
        System.out.println("números del 1 al 100 usando while: ");
        while(count < 100){
            count++;
            if(count == 100){
                System.out.print(count + "\n");
            } else{
                System.out.print(count + ", ");
            }
        }
    }
    private static void ejercicio5(){
        System.out.println("\n Ejercicio 5:");
        System.out.println("números del 1 al 100 usando for: ");
        for (int count = 1; count < 101; count++) {
            if(count == 100){
                System.out.print(count + "\n");
            } else{
                System.out.print(count + ", ");
            }
        }
    }
    private static void ejercicio6(){
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("\n Ejercicio 6:");

        do {
            System.out.print("Introduce un número mayor o igual que 0: ");
            numero = teclado.nextInt();
        } while (numero < 0);

        System.out.println("El número introducido es: " + numero);
    }
    private static void ejercicio7(){
        System.out.println("\n Ejercicio 7:");
        String contrasena = "acierto123";
        Scanner teclado = new Scanner(System.in);
        int intentos = 0;
        boolean accesoConcedido = false;

        while (intentos < 3 && !accesoConcedido) {
            System.out.println("Introduce la contraseña: ");
            String entrada = teclado.nextLine();

            if (entrada.equals(contrasena)) {
                System.out.println("Enhorabuena");
                accesoConcedido = true;
            } else {
                intentos++;
                if (intentos < 3) {
                    System.out.println("Contraseña incorrecta. Intenta de nuevo.");
                }
            }
        }
        if (!accesoConcedido) {
            System.out.println("Has excedido el número máximo de intentos.");
        }
    }
    private static void ejercicio8(){
        System.out.println("\n Ejercicio 8:");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un día de la semana: ");
        String dia = teclado.nextLine().toLowerCase();

        switch (dia) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un día laboral.");
                break;
            case "sábado":
            case "sabado":
            case "domingo":
                System.out.println("No es un día laboral.");
                break;
            default:
                System.out.println("Día no válido.");
        }
    }
    private static void ejercicio9(){
        System.out.println("\n Ejercicio 9:");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una frase para contar los espacios: ");
        String frase = teclado.nextLine();
        int espacios = 0;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == ' '){
                espacios++;
            }
        }
        System.out.println("en esa frase hay " + espacios + " espacios");
    }
}