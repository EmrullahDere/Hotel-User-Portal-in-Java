//Emrullah Dere-180501036
import java.util.Date;

public class Reisepaket {

	private int Paket_ID;
	private String Destination;
	private int Anzahl_der_Tage;
	private Date Startdatum;
	private Date Enddatum;
	
	public Reisepaket(int Paket_ID) {
		
		this.Paket_ID=Paket_ID;
		
	}
	
	public Reisepaket(int Paket_ID,String Destination,int Anzahl_der_Tage,Date Startdatum,Date Enddatum) {
		
		this.Paket_ID=Paket_ID;
		this.Destination=Destination;
		this.Anzahl_der_Tage=Anzahl_der_Tage;
		this.Startdatum=Startdatum;
		this.Enddatum=Enddatum;
	}
	public int getPaket_ID() {
		return Paket_ID;
	}
	
	public String getString_Paket_Id() {
		return "" + Paket_ID;
		
		
	}
	public void setPaket_ID(int Paket_ID) {
		this.Paket_ID=Paket_ID;
	}


	public String getDestination() {
		return Destination;
	}


	public void setDestination(String destination) {
		Destination = destination;
	}


	public int getAnzahl_der_Tage() {
		return Anzahl_der_Tage;
	}


	public void setAnzahl_der_Tage(int anzahl_der_Tage) {
		Anzahl_der_Tage = anzahl_der_Tage;
	}


	public Date getStartdatum() {
		return Startdatum;
	}


	public void setStartdatum(Date startdatum) {
		Startdatum = startdatum;
	}


	public Date getEnddatum() {
		return Enddatum;
	}


	public void setEnddatum(Date enddatum) {
		Enddatum = enddatum;
	}
	@Override
	public boolean equals(Object Object1) {
		
		Reisepaket r =(Reisepaket)Object1;
		if(Paket_ID==r.getPaket_ID()){
			return true;
			
		}
		return false;	
	}
	@Override
	public String toString() {
		
		String i = "" + Paket_ID;
		String info = Paket_ID + " " +Destination + " " +Anzahl_der_Tage + " " + Startdatum.getDate() + "-" + (Startdatum.getMonth()+1) + "-" + (Startdatum.getYear()+1900) + "/" +  Enddatum.getDate() + "-" + (Enddatum.getMonth()+1) + "-" + (Enddatum.getYear()+1900);                                                     
		
		return info;
	}
}