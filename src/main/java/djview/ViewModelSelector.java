package main.java.djview;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ViewModelSelector extends DJView{
	
	JComboBox combo;
	
	public ViewModelSelector(ControllerInterface controller, BeatModelInterface model) {
		super(controller, model);
	}

	@Override
    public void createControls() {
		// Create all Swing components here
        JFrame.setDefaultLookAndFeelDecorated(true);
        controlFrame = new JFrame("Control");
        controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controlFrame.setSize(new Dimension(100, 80));

        controlPanel = new JPanel(new GridLayout(1, 2));

        menuBar = new JMenuBar();
        menu = new JMenu("DJ Control");
        startMenuItem = new JMenuItem("Start");
        menu.add(startMenuItem);
        startMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                controller.start();
            }
        });
        stopMenuItem = new JMenuItem("Stop");
        menu.add(stopMenuItem); 
        stopMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                controller.stop();
            }
        });
        JMenuItem exit = new JMenuItem("Quit");
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        menu.add(exit);
        menuBar.add(menu);
        controlFrame.setJMenuBar(menuBar);

        bpmTextField = new JTextField(2);
        bpmLabel = new JLabel("Enter BPM:", SwingConstants.RIGHT);
        setBPMButton = new JButton("Set");
        setBPMButton.setSize(new Dimension(10,40));
        increaseBPMButton = new JButton(">>");
        decreaseBPMButton = new JButton("<<");
        setBPMButton.addActionListener(this);
        increaseBPMButton.addActionListener(this);
        decreaseBPMButton.addActionListener(this);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));

		buttonPanel.add(decreaseBPMButton);
		buttonPanel.add(increaseBPMButton);
		
		String[] options={"Beat","Heart","Dosifier"};
		combo = new JComboBox(options);
		combo.setSelectedIndex(0);
		combo.addActionListener(this);

        JPanel enterPanel = new JPanel(new GridLayout(1, 2));
        enterPanel.add(bpmLabel);
        enterPanel.add(bpmTextField);
        JPanel insideControlPanel = new JPanel(new GridLayout(4, 1));
        insideControlPanel.add(enterPanel);
        insideControlPanel.add(setBPMButton);
        insideControlPanel.add(buttonPanel);
        insideControlPanel.add(combo);
        controlPanel.add(insideControlPanel);
        
        bpmLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        controlFrame.getRootPane().setDefaultButton(setBPMButton);
        controlFrame.getContentPane().add(controlPanel, BorderLayout.CENTER);

        controlFrame.pack();
        controlFrame.setVisible(true);
    }
	
	public void createView() {
		// Create all Swing components here
        viewPanel = new JPanel(new GridLayout(1, 2));
        viewFrame = new JFrame("View");
        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewFrame.setSize(new Dimension(100, 80));
        bpmOutputLabel = new JLabel("offline", SwingConstants.CENTER);
        bpmOutputLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		beatBar = new BeatBar();
		beatBar.setValue(0);
        JPanel bpmPanel = new JPanel(new GridLayout(2, 1));
		bpmPanel.add(beatBar);
        bpmPanel.add(bpmOutputLabel);
        viewPanel.add(bpmPanel);
        viewFrame.getContentPane().add(viewPanel, BorderLayout.CENTER);
        viewFrame.pack();
        viewFrame.setVisible(true);
	}
    
    @Override
    public void actionPerformed(ActionEvent event) {
    	if(event.getSource() == combo){
    		JComboBox cb=(JComboBox)event.getSource();
    		String opt=(String) cb.getSelectedItem();
    		switch(opt){
    			case "Beat":
    				setModel(new BeatModel());
    				break;
    			case "Heart":
    				setModel(new HeartAdapter(HeartModel.getInstance()));
    				break;
    			case "Dosifier":
    				DosifierSimulator simulator = new DosifierSimulator();
    				DosifierModel dosifModel =new DosifierModel(simulator);
    				simulator.setModel(dosifModel);
    				setModel(new DosifierAdapter(dosifModel));
    				break;
    		}
    	}else{
    		if (event.getSource() == setBPMButton) {
    			int bpm = Integer.parseInt(bpmTextField.getText());
    			controller.setBPM(bpm);
    		} else if (event.getSource() == increaseBPMButton) {
    			controller.increaseBPM();
    		} else if (event.getSource() == decreaseBPMButton) {
    			controller.decreaseBPM();
    		}
    	}
    }
    
    public void setModel(BeatModelInterface model){
    	super.model.removeObserver((BeatObserver)this);
    	super.model.removeObserver((BPMObserver)this);
    	model.registerObserver((BeatObserver)this);
    	model.registerObserver((BPMObserver)this);
    	super.model=model;
    	
    }
    
}
