package Ejercicio1;

public class Automovil implements Comparable<Automovil> {
	String marca;
	String modelo;
	String matricula;
	int anioFabricacion;
	String motor;
	String potencia;
	
	public Automovil(String marca, String modelo, String matricula, int anioFabricacion, String motor, String potencia) {
		if(motor.equals("GASOLINA")|| motor.equals("DIESEL") || motor.equals("HIBRIDO") || motor.equals("ELECTRICO")) {
			this.marca = marca;
			this.modelo = modelo;
			this.matricula = matricula;
			this.anioFabricacion = anioFabricacion;
			this.motor = motor;
			this.potencia = potencia;
		}else {
			System.out.println("ERROR: El valor especificado para el tipo de motor no es valido");
		}
				
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public String getMotor() {
		return motor;
	}
	
	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	
	@Override
	public int compareTo(Automovil a) {
		int resultado= marca.compareTo(a.marca);
		if(resultado==0)
			resultado = modelo.compareTo(a.modelo);
			if(resultado == 0)
				resultado = motor.compareTo(a.motor);
		return resultado;
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", anioFabricacion="
				+ anioFabricacion + ", motor=" + motor + ", potencia=" + potencia + "]\n";
	}

	
	
	
}
