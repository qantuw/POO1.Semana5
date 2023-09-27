package figurasGeometricas;

public class Rectangulo {

	// Atributos
    private float largo;
    private float ancho;

    // Constructor por defecto
    public Rectangulo() {
        this.largo = 1.0f;
        this.ancho = 1.0f;
    }

    // Constructor personalizado
    public Rectangulo(float largo, float ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    // Método para obtener el largo
    public float getLargo() {
        return largo;
    }

    // Método para obtener el ancho
    public float getAncho() {
        return ancho;
    }

    // Método para obtener el área del rectángulo
    public float getArea() {
        return largo * ancho;
    }

    // Setter para actualizar el largo
    public void setLargo(float largo) {
        this.largo = largo;
    }

    // Setter para actualizar el ancho
    public void setAncho(float ancho) {
        this.ancho = ancho;

	}

}
