package pizzeria;

public class BufferPizza {
	private int[] buffer;
	private int indice;
	
	BufferPizza(){
		
		buffer = new int[8];
		indice = 0;
		for(int i =0; i<8; i++) {
			buffer[i]=0;
		}
	}
		public synchronized boolean ConsegnaOrdine(int nt, int np) {//nt=numero tavolo, np= numero pizze richieste
			
			if(np<0||np>=8||indice==7||indice+np>=7) {
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
	
	


