package figurasGeometricas;

public class Circulo {
	
	// Atributos
    private double radio;
    private String color;
		
	    // Constructor por defecto
	    public Circulo() {
	        this.radio = 1.0;
	        this.color = "red";
	    }

	    // Constructor personalizado
	    public Circulo(double radio, String color) {
	        this.radio = radio;
	        this.color = color;
	    }

	    // Método para obtener el radio
	    public double getRadio() {
	        return radio;
	    }

	    // Método para obtener el área del círculo
	    public double getArea() {
	        return Math.PI * radio * radio;
	    }

	    // Método para obtener el color
	    public String getColor() {
	        return color;
	    }
	    // Setter para actualizar el radio
	    public void setRadio(double radio) {
	        this.radio = radio;
	    }
	    // Setter para actualizar el color
	    public void setColor(String color) {
	        this.color = color;
	    }
	}



	


