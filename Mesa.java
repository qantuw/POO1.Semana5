package objetos;

public class Mesa {

	// Atributos
    private float ancho;
    private float altura;
    private String color;
    private String material;
    private String forma;

    // Constructor
    public Mesa() {
        // Valores por defecto
    	
        this.ancho = 0.0f;
        this.altura = 0.0f;
        this.color = "Desconocido";
        this.material = "Desconocido";
        this.forma = "Desconocida";
    }

    // Métodos para obtener el material y la forma
    public String getMaterial() {
        return material;
    }

    public String getForma() {
        return forma;

	}

}
