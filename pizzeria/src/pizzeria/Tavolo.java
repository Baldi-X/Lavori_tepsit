package pizzeria;

public class Tavolo implements Runnable {
	
	private int Npersone;
	int[] buffer;
	
	public int[] getBuffer() {
		return buffer;
	}


	public void setBuffer(int[] buffer) {
		this.buffer = buffer;
	}


	Tavolo(int n){
		Npersone = n;
		if(n>5) {
			System.out.println("il numero massimo a tavolo è 5 andate via!!");
			Npersone = 0;
		}
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
