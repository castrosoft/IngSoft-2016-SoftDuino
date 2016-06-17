package main.java.djview;

public class DosifierSimulator implements Runnable{

	private int incomingByte;
	DosifierModel model;
	
	public DosifierSimulator(DosifierModel model){
		this.model=model;
	}
	
	public void recibirDato(int dato){
		incomingByte=dato;
		/*if(incomingByte!=0){
	        if(incomingByte<=63){
	            agregarCloro(incomingByte);
	        } else {
	            if((incomingByte-64)<=63){
	                agregarPh(incomingByte-64);
	            } else {
	                dosisDiaria();
	            }
	        }
	        incomingByte=0;
		}*/
	}
		
	private void agregarCloro(int cant){
		for(int i=1;i<=cant;i++){
		    String dataSend1 = "c";
		    try {
				Thread.sleep(1440); //tiempo estimado de una dosificacion de 1 medida de cloro
				model.recibirDato(dataSend1 + i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.err.println(e.toString());			}
		  }
	}
	
	private void agregarPh(int cant){
		for(int i=1;i<=cant;i++){
		    String dataSend1 = "p";
		    try {
				Thread.sleep(1440); //tiempo estimado de una dosificacion de 1 medida de cloro
				model.recibirDato(dataSend1 + i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.err.println(e.toString());			}
		  }
	}
	
	private void agregarAlguicida(int cant){
		for(int i=1;i<=cant;i++){
		    String dataSend1 = "a";
		    try {
				Thread.sleep(500);
				model.recibirDato(dataSend1 + i);
			} catch (InterruptedException e) {
				System.err.println(e.toString());			}
		}
	}
	
	private void agregarClarificante(int cant){
		for(int i=1;i<=cant;i++){
		    String dataSend1 = "t";
		    try {
				Thread.sleep(500);
				model.recibirDato(dataSend1 + i);
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
	            agregarCloro(incomingByte);
	        } else {
	            if((incomingByte-64)<=63){
	                agregarPh(incomingByte-64);
	            } else {
	                dosisDiaria();
	            }
	        }
	        incomingByte=0;
		}
	}
}
