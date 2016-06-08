package main.java.djview;

public class MyDosifierModelTestDrive {
	 	public static void main (String[] args) {
			DosifierModel dosifierModel =new DosifierModel();
	        ControllerInterface model = new DosifierController(dosifierModel);
	    }
}
