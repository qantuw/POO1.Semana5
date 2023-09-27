package objetos;

public class Celular {
	
	// Atributos
    private int número;
    private String marca;
    private String color;
    private String modelo;
    private String plan;

    // Constructor
    public Celular() {
        // Valores por defecto
    	
        this.número = 0;
        this.marca = "Desconocida";
        this.color = "Desconocido";
        this.modelo = "Desconocido";
        this.plan = "Sin plan";
    }

    // Métodos para obtener el modelo y la marca
    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;

	}

}
