package Persona;

public class Persona {
    private String nombre;
    private String apellidos;
    private int dniSinLetra;
    private int edad;
    private String nacionalidad;

    public String getNombre()
    {
        return nombre;
    }

    public String getApellidos()
    {
        return apellidos;
    }

    public int getDniSinLetra()
    {
        return dniSinLetra;
    }

    public int getEdad()
    {
        return edad;
    }

    public String getNacionalidad()
    {
        return nacionalidad;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }

    public void setDniSinLetra(int dniSinLetra)
    {
        this.dniSinLetra = dniSinLetra;
    }

    public void setEdad(int edad)
    {
        if (edad <= 21)
        {
            System.out.println("Estas hecho un chaval.");
        } 
        else{
            System.out.println("Ya eres mayor.");
        }
        this.edad = edad;
    }
    public void setNacionalidad(String nacionalidad)
    {
        this.nacionalidad = nacionalidad;
    }
}
