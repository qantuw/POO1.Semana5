package objetos;

public class Automovil {

	 // Atributos
    private String placa;
    private String marca;
    private String modelo;
    private String color;
    private String tipo;

    // Constructor
    public Automovil() {
        // Valores por defecto
        this.placa = "Desconocida";
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
        this.color = "Desconocido";
        this.tipo = "Desconocido";
    }

    // Método para obtener la marca
    public String getMarca() {
        return marca;
    }

    // Método para obtener el modelo
    public String getModelo() {
        return modelo;

	}

}
