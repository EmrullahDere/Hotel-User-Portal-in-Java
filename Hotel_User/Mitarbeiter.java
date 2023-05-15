//Emrullah Dere-180501036

public class Mitarbeiter extends Person {
	
	private String abschnittsname;
	private double gehalt;
	
	public Mitarbeiter (String id) {
		
		super(id);
	}
	public Mitarbeiter (String id,String name,String nachname) {
		
		super(id,name,nachname);
	}
	
	public String getAbschnittsname() {
		return abschnittsname;
	}
	
	public void setMitarbeiter_id(String abschnittsname) {

			this.abschnittsname = abschnittsname;
		}
	
	public double getGehalt() {
		return gehalt;
	}
	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}
	
	@Override
	public String toString() {
		
		String i = "" + getId();
		String info = i + " " +getName() + " " +getNachname();
		
		return info;
	}
	@Override
	public boolean equals(Object Object1) {
		
		Mitarbeiter x =(Mitarbeiter)Object1;
		if(getId().equals(x.getId())) {
			return true;
		}
		return false;	
	}
}
