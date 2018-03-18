package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterface;

public class Menjacnica implements MenjacnicaInterface {
	private LinkedList<Valuta> valute = new LinkedList<>();
	@Override
	public void dodajKurs(String naziv, Kurs kurs) {
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getNaziv().equals(naziv))
				valute.get(i).setKurs(kurs);
		}
	}

	@Override
	public void obrisiKurs(String naziv, Kurs kurs) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs vratiKurs(String naziv, GregorianCalendar dan) {
		// TODO Auto-generated method stub
		return null;
	}

}
