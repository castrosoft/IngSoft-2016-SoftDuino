package main.java.djview;

public class DosifierController implements ControllerInterface {
	
	DosifierAdapter adapter;	//Se utiliza adapter en lugar de ModelInterface para reutilizar la escritura de los metodos							//revisar y opinar sobre este cambio
	DosifierModelInterface model;
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
		this.model = model;
		dosifierView = new DosifierView(this,model);
		dosifierView.createDosifierGUI();
		
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
		String className = Thread.currentThread().getStackTrace()[2].getClassName();
		if(className.equals("main.java.djview.DosifierView")){
			int bpm = Integer.parseInt(dosifierView.phTextField.getText());
			model.setQuantity(64+bpm);
		}
		
	}
    
	public void decreaseBPM() {
		String className = Thread.currentThread().getStackTrace()[2].getClassName();
		if(className.equals("main.java.djview.DosifierView")){
			model.setQuantity(130);
		}
		
  	}
  
 	public void setBPM(int bpm) {
 		if(bpm>0 && bpm<=63){
			String className = Thread.currentThread().getStackTrace()[2].getClassName();
			if(className.equals("main.java.djview.DosifierView")){
				model.setQuantity(bpm);
			}else{
				adapter.setBPM(bpm);
			}
		}
	}
 	
 	public void empezar(){
 		model.abrirConexion();
 		dosifierView.unselectDesconectado();
 		
 	}
	
 	public void terminar(){
 		model.cerrarConexion();
 		dosifierView.unselectConectado();
 		
 	}
	

}
