package no.hvl.dat100.jplab12.oppgave3;
import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.oppgave2.Tekst;

public class Blogg {

	// TODO: objektvariable
	public Innlegg[] innleggtabell;
	public int nesteledig;
	

	public Blogg() {

		innleggtabell = new Innlegg[20];

	}

	public Blogg(int lengde) {

		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;

		
		
		
		
	}

	public int getAntall() {

		return nesteledig;
		
	}

	public Innlegg[] getSamling() {
		
		return innleggtabell;
	}

	public int finnInnlegg(Innlegg innlegg) {
		
		int pos = -1;
		
		for (int i = 0; i < innleggtabell.length; i++ ) {
			
			if(innlegg.erLik(innleggtabell[i])) {
				pos = i;
			}
		
		}

		return pos;
		
	}

	public boolean finnes(Innlegg innlegg) {
		
		boolean sjekk = false;
		
		for (int i = 0; i < innleggtabell.length; i++ ) {
			
			if(innlegg.erLik(innleggtabell[i])) {
				sjekk = true;
			}
		}
		
	return sjekk;
	
	}

	public boolean ledigPlass() {
		
		boolean ledig = false;
		
		if (nesteledig < innleggtabell.length) {
			ledig = true;
		}
		
		return ledig;

	}

	public boolean leggTil(Innlegg innlegg) {
		
		boolean sjekkLedig = false;
		
		if(finnes(innlegg) == false && ledigPlass() == true) {
			
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			sjekkLedig = true;
			
		}
		
		return sjekkLedig;
	}

	public String toString() {
		
	
			String str = innleggtabell.length+"\n";
			
			for (int i = 0; i < innleggtabell.length; i++) {
				
				str += innleggtabell[i].toString(); 
				
			}
			
			return str;
		}



	// valgfrie oppgaver nedenfor

	public void utvid() {
		
		int lengde = innleggtabell.length * 2;
		
		Innlegg [] tab = new Innlegg [lengde];
		System.arraycopy(innleggtabell, 0, tab, 0, innleggtabell.length);
		innleggtabell = tab;
		
		//for(int i = 0; i < innleggtabell.length; i++) {
		//	innleggtabell[i]=tab[i];	
		//}
		//innleggtabell = tab;
		

		
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}