package main.java.djview;

public class DosifierController implements ControllerInterface {
	
	DosifierAdapter adapter;
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
        int bpm = adapter.getBPM();
        adapter.setBPM(bpm + 1);
	}
    
	public void decreaseBPM() {
        int bpm = adapter.getBPM();
        adapter.setBPM(bpm - 1);
  	}
  
 	public void setBPM(int bpm) {
		adapter.setBPM(bpm);
	}
	
	

}
