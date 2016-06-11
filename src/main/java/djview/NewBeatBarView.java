package main.java.djview;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NewBeatBarView implements ActionListener{
	JFrame window;
	
	JPanel panel;
	
	JRadioButton beatButton;
	JRadioButton heartButton;
	JRadioButton dosifierButton;
	
	DJView djView;
	//DosifierView dosifierView;
	ControllerInterface controller;
	
	public NewBeatBarView(){
		window = new JFrame("Model Selector");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(new Dimension(100, 80));
		
		panel = new JPanel(new GridLayout(3,1));
		beatButton = new JRadioButton("1-Beat Model");
		heartButton = new JRadioButton("2-Heart Model");
		dosifierButton = new JRadioButton("3-Dosifier Model");
		
		beatButton.addActionListener(this);
		heartButton.addActionListener(this);
		dosifierButton.addActionListener(this);
		
		panel.add(beatButton);
		panel.add(heartButton);
		panel.add(dosifierButton);
		
		window.getContentPane().add(panel, BorderLayout.CENTER);
		window.pack();
		
		//beatButton.doClick();
		

		
		window.setVisible(true);
		
		
	}
	
	public void setController(ControllerInterface controller){
		this.controller=controller;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == beatButton){
			setController(new BeatController(new BeatModel()));
			heartButton.setSelected(false);
			dosifierButton.setSelected(false);
		}else{
			if(event.getSource() == heartButton){
				setController(new HeartController(HeartModel.getInstance()));
				beatButton.setSelected(false);
				dosifierButton.setSelected(false);
			}else{
				setController(new DosifierController(new DosifierModel()));
				beatButton.setSelected(false);
				heartButton.setEnabled(false);
			}
		}
	}
}
