package main.java.djview;

public class DosifierSimulator implements Runnable{

	private int incomingByte;
	private String dataSend1;
	private String dataReceivedType;
	DosifierModelInterface model;
	
	public void recibirDato(int dato){
		incomingByte=dato;
	}
		
	private void agregarCloro(int cant){
		for(int i=1;i<=cant;i++){
		    dataSend1 = "c";
		    try {
				Thread.sleep(1440); //tiempo estimado de una dosificacion de 1 medida de cloro
				model.recibirDato(dataSend1 + i);
				dataSend1=null;
			} catch (InterruptedException e) {
				System.err.println(e.toString());			}
		  }
	}
	
	private void agregarPh(int cant){
		for(int i=1;i<=cant;i++){
		    dataSend1 = "p";
		    try {
				Thread.sleep(1440); //tiempo estimado de una dosificacion de 1 medida de cloro
				model.recibirDato(dataSend1 + i);
				dataSend1=null;
			} catch (InterruptedException e) {
				System.err.println(e.toString());			}
		  }
	}
	
	private void agregarAlguicida(int cant){
		for(int i=1;i<=cant;i++){
		    dataSend1 = "a";
		    try {
				Thread.sleep(500);
				model.recibirDato(dataSend1 + i);
				dataSend1=null;
			} catch (InterruptedException e) {
				System.err.println(e.toString());			}
		}
	}
	
	private void agregarClarificante(int cant){
		for(int i=1;i<=cant;i++){
		    dataSend1 = "t";
		    try {
				Thread.sleep(500);
				model.recibirDato(dataSend1 + i);
				dataSend1=null;
			} catch (InterruptedException e) {
				System.err.println(e.toString());
			}
		}
	}
	
	private void dosisDiaria(){
		agregarCloro(10);
		agregarPh(7);
		agregarAlguicida(5);
		agregarClarificante(3);
	}

	@Override
	public void run() {
		if(incomingByte!=0){
	        if(incomingByte<=63){
	        	dataReceivedType="c";
	            agregarCloro(incomingByte);
	        } else {
	            if((incomingByte-64)<=63){
	            	dataReceivedType="p";
	                agregarPh(incomingByte-64);
	            } else {
	            	dataReceivedType="d";
	                dosisDiaria();
	            }
	        }
	        incomingByte=0;
		}
	}

	public int getIncomingByte() {
		return incomingByte;
	}

	public String getDataSend1() {
		return dataSend1;
	}
	
	public String getDataReceivedType() {
		return dataReceivedType;
	}
	
	public void setModel(DosifierModelInterface model){
		this.model = model;
	}
}
