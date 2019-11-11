package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;

import java.io.*;


import no.hvl.dat100.jplab12.oppgave3.*;

import no.hvl.dat100.jplab12.oppgave1.Innlegg;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg samling, String filnavn) {
		
		boolean skrevet = false;
		
		Innlegg[] tab = samling.getSamling();
		
		try {
			
			PrintWriter printSkriver = new PrintWriter(MAPPE + filnavn);
		
			for(int i = 0; i < samling.getAntall(); i++) {
			
				printSkriver.printf(tab[i].toString());
			}
			
			skrevet = true;
			printSkriver.close();
			
				
				
				
		
		
			}catch(FileNotFoundException e) {
				System.out.println("Filen ble ikke skrevet... Prøv igjen!");
				skrevet = false;
			}
	
			
		return skrevet;
		
	}

}
