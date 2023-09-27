package personas;

public class Empleado {

	 // Atributos
    private int id;
    private String nombre;
    private String apellido;
    private int salario;

    // Constructor
    public Empleado() {
        // Valores por defecto
        this.id = 0;
        this.nombre = "Desconocido";
        this.apellido = "Desconocido";
        this.salario = 0;
    }

    // Método para obtener el salario
    public int getSalario() {
        return salario;
    }

    // Método para obtener el salario anual
    public int getSalarioAnual() {
        return salario * 12; // Suponiendo que el salario se representa en términos mensuales

	}

}
