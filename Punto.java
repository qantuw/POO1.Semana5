package figurasGeometricas;

public class Punto {

	 // Atributos
    private double coordenadaX;
    private double coordenadaY;

    // Constructor
    public Punto() {
        this.coordenadaX = 0.0;
        this.coordenadaY = 0.0;
    }

    public Punto(double coordenadaX, double coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    // Métodos para obtener las coordenadas X e Y
    public double getCoordenadaX() {
        return coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;

	}

}
