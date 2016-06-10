package main.java.djview;

public class DosifierAdapter implements BeatModelInterface{

	DosifierModelInterface dosifier;
	 
	public DosifierAdapter(DosifierModelInterface dosifier) {
		this.dosifier = dosifier;
	}

    public void initialize() {}
  
    public void on() {
    	dosifier.abrirConexion();
    }
  
    public void off() {
    	dosifier.cerrarConexion();
    }
   
	public int getBPM() {
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		StackTraceElement element = stackTrace[2];
		System.out.println(element.getMethodName());
		return dosifier.getState();
	}
  
    public void setBPM(int bpm) {
    	dosifier.setQuantity(bpm);
    }
   
	public void registerObserver(BeatObserver o) {
		dosifier.registerObserver(o);
	}
    
	public void removeObserver(BeatObserver o) {
		dosifier.removeObserver(o);
	}
     
	public void registerObserver(BPMObserver o) {
		dosifier.registerObserver(o);
	}
  
	public void removeObserver(BPMObserver o) {
		dosifier.removeObserver(o);
	}
}
