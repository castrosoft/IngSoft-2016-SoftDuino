package main.java.djview;

public interface DosifierModelInterface {

	int getStateCloro();
	int getStatePh();
	int getStateAlguicida();
	int getStateClarificante();
	void setQuantity(int cant);
	void abrirConexion();
	void cerrarConexion();
	void enviarDatos(int cant);
	void registerObserver(CloroObserver o);
	void removeObserver(CloroObserver o);
	void registerObserver(PhObserver o);
	void removeObserver(PhObserver o);
	void registerObserver(ClarificanteObserver o);
	void removeObserver(ClarificanteObserver o);
	void registerObserver(AlguicidaObserver o);
	void removeObserver(AlguicidaObserver o);
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
}
