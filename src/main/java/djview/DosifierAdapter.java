package main.java.djview;

public class DosifierAdapter implements BeatModelInterface{

	DosifierModelInterface dosifier;
	 
	public DosifierAdapter(DosifierModelInterface dosifier) {
		this.dosifier = dosifier;
	}

    public void initialize() {
    	
    }
  
    public void on() {}
  
    public void off() {}
   
	public int getBPM() {
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
