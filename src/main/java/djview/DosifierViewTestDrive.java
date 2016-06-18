package main.java.djview;

public class DosifierViewTestDrive {

	public static void main(String[] args) {
		DosifierSimulator simulator = new DosifierSimulator();
		DosifierModelInterface model = new DosifierModel(simulator);
		simulator.setModel(model);
		ControllerInterface controller = new DosifierController(model);

	}

}
