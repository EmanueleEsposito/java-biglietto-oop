package jana60;

import java.text.DecimalFormat;

public class Biglietto {

	// Attrributi private
	private int chilometri;
	private int et‡DelPasseggero;

	// Attributi per il calcolo del prezzo del biglietto
	private DecimalFormat prezzoFormattato = new DecimalFormat("0.00Ä");
	private double costoAlKm = 0.21;
	private double percScontoMinorenni = 0.20;
	private double percScontoOver65 = 0.40;

	// Costruttore
	public Biglietto(int chilometri, int et‡DelPasseggero) {
		super();
		this.chilometri = chilometri;
		this.et‡DelPasseggero = et‡DelPasseggero;
	}

	// Metodi getter e setter
	public void setChilometri(int chilometri) {
		this.chilometri = chilometri;
	}

	public void setEt‡DelPasseggero(int et‡DelPasseggero) {
		this.et‡DelPasseggero = et‡DelPasseggero;
	}

	// Metodo che calcola il prezzo del biglietto

	public double getPrezzoBiglietto() {
		double prezzoBase = 0.0;

		prezzoBase = costoAlKm * chilometri;

		if (et‡DelPasseggero < 18) {
			return prezzoBase -= (prezzoBase * percScontoMinorenni);
		} else if (et‡DelPasseggero >= 65) {
			return prezzoBase -= (prezzoBase * percScontoOver65);
		} else {
			return prezzoBase;
		}
	}

	public String prezzoFinaleFormattato() {
		return prezzoFormattato.format(getPrezzoBiglietto());

	}
}
