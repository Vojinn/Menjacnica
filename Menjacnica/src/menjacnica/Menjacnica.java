package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();
	
	

	@Override
	public void dodajKursValuteZaDan(Kurs kurs, String nazivValute) {
		for(int i = 0; i < valute.size(); i++) {
			if(nazivValute.equals(valute.get(i).getNaziv()))
				kursevi.add(kurs);
		}

	}

	@Override
	public void brisanjeKursaValuteZaDan(GregorianCalendar datum, String nazivValute) {
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(nazivValute)) {
				for (int j = 0; j < kursevi.size(); j++) {
					if(kursevi.get(j).getDatum().equals(datum))
						kursevi.remove(j);
				}
			}
		}

	}

	@Override
	public Kurs vracanjeKursaValuteZaDan(GregorianCalendar datum, String nazivValute) {
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(nazivValute))
				for (int j = 0; j < kursevi.size(); j++) {
					if(kursevi.get(j).getDatum().equals(datum))
						return kursevi.get(j);
				}
		}
		return null;
	}

}
