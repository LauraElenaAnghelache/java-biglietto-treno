package jana60;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		int eta;
		int kilometri;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Inserisci età: ");
			eta = scan.nextInt();
			System.out.println("Kilometri da percorrere: ");
			kilometri = scan.nextInt();
		}
		System.out.println("Età:" + eta);
		System.out.println("kilometri:" + kilometri);
		
		float prezzoBiglietto = kilometri * 0.21f;
		double prezzoScontatoGiovani = prezzoBiglietto - (prezzoBiglietto * 0.2);
		double prezzoScontatoAnziani = prezzoBiglietto - (prezzoBiglietto * 0.4);
		DecimalFormat df = new DecimalFormat("0.00");
		
		if(eta <=18) {
			System.out.println("passegero categoria Giovani, prezzo biglietto: " + df.format(prezzoScontatoGiovani));
			}
		else if(eta >=65) {
			System.out.println("passegero categoria Anziani, prezzo biglietto: " + df.format(prezzoScontatoAnziani));
		}
		
		System.out.println("Arrivederci");
	
				
	}
}
		




