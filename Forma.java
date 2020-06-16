package esempioBridge;

//Forma � una Abstraction (� l'interfaccia per i client)
public class Forma {
	private Drawing impl  = new SdtDraw();
	public void setImplementor(Drawing imp) { 
		this.impl = imp;
	}
	
	public void drawLine(int x, int y, int z, int t) {
		impl.drawLine(x, y, z, t);
	}
}