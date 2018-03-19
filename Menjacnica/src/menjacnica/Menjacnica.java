package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
	
	@Override
	public void dodajKursValuteZaDan(Kurs kurs, String nazivValute) {
		if(kursevi.contains(kurs)) {
			throw new RuntimeException("Ovaj kurs je vec dodat u listu kurseva.");
		}else {
			kursevi.add(kurs);
		}

	}

	@Override
	public void brisanjeKursaValuteZaDan(GregorianCalendar datum, String nazivValute) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs vracanjeKursaValuteZaDan(GregorianCalendar datum, String nazivValute) {
		// TODO Auto-generated method stub
		return null;
	}

}
