package main.java.djview;

public interface DosifierModelInterface {

	int getState();
	void setQuantity(int cant);
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
	
}
