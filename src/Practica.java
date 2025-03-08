import java.util.Scanner;
import java.util.*;

class Practica {
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;

    //Metodo constructor
    public Practica(String nombre, String apellido, String genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }

    //Metodo getter para obtener los valores de lo privado
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }
}
