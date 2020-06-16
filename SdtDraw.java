package esempioBridge;

//ConcreteImplementor (implementa l’interfaccia di Implementor e fornisce le operazioni concrete)
public class SdtDraw implements Drawing{

	private int conta = -1;
	private  String[] seg = new String[] {"a", "b", "c", "d"};
	
	
	@Override
	public void drawLine(int x1, int y1, int x2, int y2) {
		conta++;
		System.out.println("Segmento " +  seg[conta] + ": (" + x1+", "+y1+") e ("+x2+", "+y2+") ");
	}

}
