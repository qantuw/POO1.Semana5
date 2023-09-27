package figurasGeometricas;

public class Triangulo {
	
	 // Atributos
    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;

    // Constructor
    public Triangulo() {
        this.vertice1 = new Punto();
        this.vertice2 = new Punto();
        this.vertice3 = new Punto();
    }

    public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    // Método para calcular el perímetro del triángulo
    public double getPerimetro() {
        double lado1 = calcularDistancia(vertice1, vertice2);
        double lado2 = calcularDistancia(vertice2, vertice3);
        double lado3 = calcularDistancia(vertice3, vertice1);

        return lado1 + lado2 + lado3;
    }

    // Método para obtener el tipo de triángulo (equilátero, isósceles o escaleno)
    public String getTipo() {
        double lado1 = calcularDistancia(vertice1, vertice2);
        double lado2 = calcularDistancia(vertice2, vertice3);
        double lado3 = calcularDistancia(vertice3, vertice1);

        if (lado1 == lado2 && lado2 == lado3) {
            return "Triángulo equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            return "Triángulo isósceles";
        } else {
            return "Triángulo escaleno";
        }
    }

    // Método para calcular la distancia entre dos puntos
    private double calcularDistancia(Punto punto1, Punto punto2) {
        double dx = punto2.getCoordenadaX() - punto1.getCoordenadaX();
        double dy = punto2.getCoordenadaY() - punto1.getCoordenadaY();
        return Math.sqrt(dx * dx + dy * dy);
	}

}
