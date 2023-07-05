package esercizio1;

public class SingleThread extends Thread {
	
	private String simbol;
	
	public SingleThread (String _simbol) {
		this.simbol = _simbol;
	}
	
	@Override 
	public void run() {
		for(int i = 0; i< 10; i++) {
			
			System.out.println(simbol);
			
			
			try {
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
	
			}
		}
		System.out.println("Stampa completata");
		
	}
}
