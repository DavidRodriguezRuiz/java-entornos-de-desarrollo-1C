package app;
import modelos.Rectangulo;
public class Main {
	
	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo(2,3);
		
		int area1 = r1.area();
		int perimetro1 = r1.perimetro();
		
		System.out.println("Área: " + area1);	
		System.out.println("Perímetro: " + perimetro1);	
	}
}