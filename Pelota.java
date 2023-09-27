package objetos;

public class Pelota {

	   // Atributos
    private float tamaño;
    private String color;

    // Constructor
    public Pelota() {
        // Valores por defecto
        this.tamaño = 0.0f;
        this.color = "Desconocido";
    }

    // Método para obtener el tamaño de la pelota
    public float getTamaño() {
        return tamaño;

	}

}
