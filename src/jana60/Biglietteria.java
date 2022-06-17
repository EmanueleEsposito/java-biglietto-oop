package jana60;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Far stampare all'utente numero di km ed et‡ del passeggero
		System.out.print("Inserire il numero di km: ");
		int chilometri = scan.nextInt();
		System.out.print("Inserire l'et‡ del passeggero: ");
		int et‡DelPassegero = scan.nextInt();

		// Creo nuovo biglietto in cui salvo i dati che l'utente inserisce
		Biglietto nuovoBiglietto = new Biglietto(chilometri, et‡DelPassegero);

		// Stampo a schermo il prezzo finale del biglietto
		System.out.println("Il prezzo del biglietto Ë: " + nuovoBiglietto.prezzoFinaleFormattato());
		scan.close();
	}

}
