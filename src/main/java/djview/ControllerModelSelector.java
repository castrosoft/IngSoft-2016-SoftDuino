package main.java.djview;

public class ControllerModelSelector implements ControllerInterface{
	ViewModelSelector view;
	
	public ControllerModelSelector(BeatModelInterface model){
		view = new ViewModelSelector(this,model);
		view.createControls();
		view.createView();
		view.model.initialize();
	}
	
	
	public void start() {
		view.model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
	}
  
	public void stop() {
		view.model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}
    
	public void increaseBPM() {
        int bpm = view.model.getBPM();
        view.model.setBPM(bpm + 1);
	}
    
	public void decreaseBPM() {
        int bpm = view.model.getBPM();
        view.model.setBPM(bpm - 1);
  	}
  
 	public void setBPM(int bpm) {
 		view.model.setBPM(bpm);
	}

}
