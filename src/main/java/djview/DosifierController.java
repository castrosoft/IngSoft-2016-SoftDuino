package main.java.djview;

public class DosifierController implements ControllerInterface {
	
	DosifierAdapter adapter;	//Se utiliza adapter en lugar de ModelInterface para reutilizar la escritura de los metodos
								//revisar y opinar sobre este cambio
	DJView view;
	
	public DosifierController(DosifierModelInterface model) {
		adapter = new DosifierAdapter(model);
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
		int cloro=Integer.parseInt(view.bpmTextField.getText());
		if(cloro>0 && cloro<=63){
			adapter.setBPM(cloro);
		}
	}
    
	public void decreaseBPM() {
		int ph=Integer.parseInt(view.bpmTextField.getText());
		if(ph>0 && ph<=63){
			adapter.setBPM(64+ph);
		}
  	}
  
 	public void setBPM(int bpm) {
 		adapter.setBPM(130);
	}
	
	

}
