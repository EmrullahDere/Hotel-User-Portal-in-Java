//Emrullah Dere-180501036

import java.util.ArrayList;

public class Kunde extends Person {

	private String pass;
	private double konto_stand;
	private ArrayList buy_reisepaket = new ArrayList();
	
	public Kunde (String id) {
		
		super(id);
	}
	public Kunde (String id,String name,String nachname) {
		
		super(id,name,nachname);
		
	}
	
	public Kunde (String id,String name,String nachname,double konto_stand) {
		
		super(id,name,nachname);
		this.konto_stand = konto_stand;
		
	}
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		
		this.pass=pass;
	}
	public double getKonto_stand() {
		return konto_stand;
	}
	public void setKonto_stand(double konto_stand) {
		this.konto_stand = konto_stand;
	}
	public ArrayList getReisepaket() {
		
		return buy_reisepaket;
	}
	@Override
	public String toString() {
		
		String i = "" + getId();
		String info = i + " " +getName() + " " +getNachname() + " " + konto_stand;
		
		return info;
		
	}
	@Override
	public boolean equals(Object Object1) {
		if(Object1 instanceof Kunde) {
			Kunde x =(Kunde)Object1;
			
			if(getId().equals(x.getId())) {
				return true;
			}
		}
		return false;
	}
	public void addReisepaket(Reisepaket br) {
		
		buy_reisepaket.add(br);
	}
	public void readReisepaket() {
		
		System.out.println(buy_reisepaket.size());
		for(int i=0;i<buy_reisepaket.size();i++) {
			
			System.out.println(buy_reisepaket.get(i));
		}
	}
}	
