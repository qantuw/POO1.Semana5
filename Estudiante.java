package personas;

public class Estudiante {

    // Atributos
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String curso;
    private float calificacion;

    // Constructor
    public Estudiante() {
        // Valores por defecto
        this.id = 0;
        this.nombre = "Desconocido";
        this.apellido = "Desconocido";
        this.edad = 0;
        this.curso = "Desconocido";
        this.calificacion = 0.0f;
    }

    // Método para obtener la nota
    public float getNota() {
        return calificacion;
    }

    // Método para obtener el curso
    public String getCurso() {
        return curso;
	}

}
