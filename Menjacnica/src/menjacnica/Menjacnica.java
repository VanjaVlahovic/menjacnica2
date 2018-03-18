package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterface;

public class Menjacnica implements MenjacnicaInterface {

	private LinkedList<Valuta> valute = new LinkedList<Valuta>();
	
	int pronadjiIndeksValute(String naziv) {
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getNaziv().equals(naziv))
				return i;
		}
		return-1;		
	}
	
	@Override
	public void dodajKurs(String naziv, Kurs kurs) {
		int index=pronadjiIndeksValute(naziv);
		if (index==-1)
			throw new RuntimeException("Ne postoji valuta sa ovim nazivom u listi.");
		valute.get(index).getKursevi().add(kurs);		

	}

	@Override
	public void obrisiKurs(String naziv, Kurs kurs) {
		int index=pronadjiIndeksValute(naziv);
		if (index==-1)
			throw new RuntimeException("Ne postoji valuta sa ovim nazivom u listi.");
		valute.get(index).getKursevi().remove(kurs);	
	}


	@Override
	public Kurs vratiKurs(String naziv, GregorianCalendar dan) {
		int index=pronadjiIndeksValute(naziv);
		if (index==-1)
			throw new RuntimeException("Ne postoji valuta sa ovim nazivom u listi.");
		for (int i = 0; i < valute.get(index).getKursevi().size(); i++) 
			if (valute.get(index).getKursevi().get(i).getDatum().equals(dan))
				return valute.get(index).getKursevi().get(i);
		return null;
	}

}
