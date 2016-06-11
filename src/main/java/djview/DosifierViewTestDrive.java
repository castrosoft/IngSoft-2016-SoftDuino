package main.java.djview;

public class DosifierViewTestDrive {

	public static void main(String[] args) {
		
		DosifierModelInterface model = new DosifierModel();
		ControllerInterface controller = new DosifierController(model);

	}

}
