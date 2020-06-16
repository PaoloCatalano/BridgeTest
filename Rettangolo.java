package esempioBridge;

//Rettangolo è una RefinedAbstraction (estende l’interfaccia definita da Abstraction)
public class Rettangolo extends Forma {

	 private int a, b, c, d;
	 
	 public Rettangolo(int xi, int yi, int xf, int yf) {
		 a = xi; b = yi; c = xf; d = yf;
	 }
	 
	 public void draw() {
		 drawLine(a, b, c, b); drawLine(a, b, a, d);
		 drawLine(c, b, c, d); drawLine(a, d, c, d);
	 }
}
