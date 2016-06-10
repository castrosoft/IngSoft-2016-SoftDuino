package main.java.djview;

public class DosifierController implements ControllerInterface {
	
	DosifierAdapter adapter;	//Se utiliza adapter en lugar de ModelInterface para reutilizar la escritura de los metodos
								//revisar y opinar sobre este cambio
	DJView view;
	DosifierView dosifierView;
	
	
	public DosifierController(DosifierAdapter adapter) {
		this.adapter = adapter;
		view = new DJView(this, adapter);
        view.createView();
        view.createControls();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
		adapter.initialize();
	}
	
	public DosifierController(DosifierModelInterface model){
		
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
 		int cloro=Integer.parseInt(view.bpmTextField.getText());
		if(cloro>0 && cloro<=63){
			adapter.setBPM(cloro);
		}
	}
	
	

}
