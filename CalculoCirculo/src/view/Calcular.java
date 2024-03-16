package view;

import model.Circulo;

public class Calcular {

	public static void main(String[] args) {
		Circulo cir = new Circulo(2.40f);
		
		double per = cir.getPerimetro();
		double area = cir.getArea();
		
		System.out.println("Perímetro: " + per + "\nÁrea: " + area);

	}

}
