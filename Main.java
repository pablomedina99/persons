import Persona.Persona;
import java.util.Scanner;

public class Main {
    public static void main (String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        Persona p = new Persona();
        System.out.println("Escribe tu nombre: ");
        p.setNombre(sc.nextLine());
        System.out.println("Escribe tu apellido: ");
        p.setApellidos(sc.nextLine());
        System.out.println("Escribe tu DNI sin letra: ");
        p.setDniSinLetra(Integer.parseInt(sc.nextLine()));
        System.out.println("Escribe tu edad: ");
        p.setEdad(Integer.parseInt(sc.nextLine()));

        System.out.println("Hola: " + p.getNombre() + " " + p.getApellidos() + " con DNI: " + String.valueOf(p.getDniSinLetra()) + " y edad: " + String.valueOf(p.getEdad()) + " años.");
    }
}
