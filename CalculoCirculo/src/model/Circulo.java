package model;

public class Circulo {
	
	public double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getPerimetro() {
		return (2 * Math.PI * raio);
	}
	
	public double getArea() {
		return (Math.PI * Math.pow(raio, 2));
	}

}
