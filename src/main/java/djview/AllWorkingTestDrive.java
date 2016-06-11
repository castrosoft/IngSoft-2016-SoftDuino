package main.java.djview;

public class AllWorkingTestDrive {

	public static void main(String[] args) {
		BeatModel beatModel = new BeatModel();
		HeartModel heartModel = HeartModel.getInstance();
		DosifierModel dosifierModel = new DosifierModel();
		
		BeatController beatController = new BeatController(beatModel);
		HeartController heartController = new HeartController(heartModel);
		DosifierController dosifierController = new DosifierController(new DosifierAdapter(dosifierModel));
	}

}
