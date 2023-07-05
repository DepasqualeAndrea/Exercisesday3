package esercizio1;

public class Main1 {

	public static void main(String[] args) {
		Thread th1 = new SingleThread("#");
		Thread th2 = new SingleThread("*");
		System.out.println("Stampa iniziata");
		th1.start();
		th2.start();
		
	}
	

}
