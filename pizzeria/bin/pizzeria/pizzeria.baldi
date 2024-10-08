package pizzeria;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferOrdine buffer1 = new BufferOrdine();
		for(int i=0; i<20; i++) {
			Tavolo tavolo = new Tavolo(5);
			tavolo.setBuffer(buffer1.getBuffer());
			Thread tavoloo = new Thread(tavolo, "tavolo:"+(i+1));
;		}

	}

}
