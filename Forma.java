package esempioBridge;

//Forma è una Abstraction (è l'interfaccia per i client)
public class Forma {
	private Drawing impl  = new SdtDraw();
	public void setImplementor(Drawing imp) { 
		this.impl = imp;
	}
	
	public void drawLine(int x, int y, int z, int t) {
		impl.drawLine(x, y, z, t);
	}
}