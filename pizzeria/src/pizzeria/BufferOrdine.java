package pizzeria;

public class BufferOrdine {
	private int[] buffer;
	private int indice;
	
	BufferOrdine(){
		
		buffer = new int[5];
		indice = 0;
		for(int i =0; i<5; i++) {
			buffer[i]=0;
		}
	}
		public synchronized boolean ConsegnaOrdine(int nt, int np) {//nt=numero tavolo, np= numero pizze richieste
			
			if(np<0||np>=5||indice==4||indice+np>=4) {
				System.out.println("non è possibile accettare questo ordine");
				return false;
			}else {
				for(int i=indice; i<(indice+np);i++) {
					buffer[i]=1;
					indice++;
					
				}
				return false;
			}
		}
		public synchronized boolean ConsegnaPizza(int nt, int np) {
			if(indice==0) {
				System.out.println("che pizze vuoi, non sono state ordinate");
				return false;
			}else {
				for(int i=indice; i<np; i--) {
					buffer[i]=0;
					indice--;
				}
				return false;
			}
		}
		public int[] getBuffer() {
			return buffer;
		}
		
	

}
	
	


