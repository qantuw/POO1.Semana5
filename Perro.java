package animales;

public class Perro {
    // Atributos
    private String nombre;
    private String raza;
    private String color;
    private int edad;

    // Constructor
    public Perro() {
        // Valores por defecto
        this.nombre = "Desconocido";
        this.raza = "Desconocida";
        this.color = "Desconocido";
        this.edad = 0;
    }

    // Método para obtener la raza
    public String getTipoRaza() {
        return raza;
    }

    // Método para obtener la edad
    public int getEdad() {
        return edad;

	}

}
