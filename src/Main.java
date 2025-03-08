import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // El hashmap para guardar los datos
        HashMap<String, Practica> Practica = new HashMap<>();

        // Contadores para los géneros
        int contadorFemenino = 0;
        int contadorMasculino = 0;

        // Contador para las edades
        int sumaEdades = 0;

        // Ciclo for porque son 5 personas que se agregan
        // La "i" es cualquier variable que se puede usar
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa los integuments datos de 5 personas " + (i + 1) + ":");

            System.out.println("Ingrese el nombre: ");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el apellido: ");
            String apellido = scanner.nextLine();

            System.out.println("¿Su genero es femenino o masculino? (m/f): ");
            String genero = scanner.nextLine();

            System.out.println("Ingrese la edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            // Se crea un objeto de la clase Practica
            Practica practica = new Practica(nombre, apellido, genero, edad);
            Practica.put(nombre, practica);

            //Sumar las edades
            //Esto funciona sumando las edades ingresadas por el usuario desde la izquierda partiendo de 0
            sumaEdades += edad;

            //A ver si funciona este contador
            if (genero.equalsIgnoreCase("m")) {
                contadorMasculino++;
            } else if (genero.equalsIgnoreCase("f")) {
                contadorFemenino++;
            }
        }

        // Se utiliza el double para que el promedio sea con decimales
        //Calcular el promedio de edades:
        double promedioEdades = sumaEdades / 5;

        //Mostrar datos ingresados de las personas
        for (Practica practica : Practica.values()) {
            System.out.println("Nombre: " + practica.getNombre());
            System.out.println("Apellido: " + practica.getApellido());
            System.out.println("Genero: " + practica.getGenero());
            System.out.println("Edad: " + practica.getEdad());
        }

        //Mostrar cantidad de generos y promedio de edades
        System.out.println("Se obtuvieron los siguientes datos: ");
        System.out.println("El promedio de edades es: " + promedioEdades);
        System.out.println("Las personas masculinas son: " + contadorMasculino);
        System.out.println("Las personas femeninas son: " + contadorFemenino);

    }
}