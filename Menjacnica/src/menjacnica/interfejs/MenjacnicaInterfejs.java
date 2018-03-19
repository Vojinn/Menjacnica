package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface MenjacnicaInterfejs {
	public void dodajKursValuteZaDan(Kurs kurs, String nazivValute);
	public void brisanjeKursaValuteZaDan(GregorianCalendar datum, String nazivValute);
	public Kurs vracanjeKursaValuteZaDan(GregorianCalendar datum, String nazivValute);
}
