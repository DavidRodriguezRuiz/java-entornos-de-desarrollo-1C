package app;
import modelos.Rectangulo;
import modelos.Circulo;
import modelos.Triangulo;
public class Main {
	
	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		
		Circulo c1 = new Circulo();
		
		Triangulo t1 = new Triangulo();
		
		int area1 = r1.area();
		int perimetro1 = r1.perimetro();
		
		double area2 = c1.area();
		double perimetro2 = c1.perimetro();
		
		int area3 = t1.area();
		
		System.out.println("Área de rectángulo: " + area1);	
		System.out.println("Perímetro de rectángulo: " + perimetro1);	
		
		System.out.println("Área de circulo: " + area2);	
		System.out.println("Perímetro de circulo: " + perimetro2);
		
		System.out.println("Área de triángulo: " + area3);	
	}
}