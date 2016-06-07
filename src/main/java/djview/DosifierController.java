package main.java.djview;

public class DosifierController implements ControllerInterface {
	
	DosifierAdapter adapter;	//Se utiliza adapter en lugar de ModelInterface para reutilizar la escritura de los metodos
								//revisar y opinar sobre este cambio
	//DosifierModelInterface model;
	DJView view;
	
	public DosifierController(DosifierModelInterface model) {
		adapter = new DosifierAdapter(model);
		//this.model = model;
		view = new DJView(this, adapter);
        view.createView();
        view.createControls();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
		adapter.initialize();
	}
  
	public void start() {
		adapter.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
	}
  
	public void stop() {
		adapter.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}
    
	public void increaseBPM() {

	}
    
	public void decreaseBPM() {

  	}
  
 	public void setBPM(int bpm) {
 		adapter.setBPM(bpm);
	}
	
	

}
