package main.java.djview;

public class MyDosifierModelTestDrive {
	 	public static void main (String[] args) {
	 		DosifierSimulator simulator = new DosifierSimulator();
			DosifierModel dosifierModel = new DosifierModel(simulator);
			simulator.setModel(dosifierModel);
	        ControllerInterface model = new DosifierController(new DosifierAdapter(dosifierModel));
	    }
}
