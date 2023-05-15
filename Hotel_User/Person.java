//Emrullah Dere-180501036


public class Person {
	
	private String name;
	private String nachname;
	private String tc;
	private String id;
	
	public Person(String id) {
		
		this.id=id;
		
	}
	public Person(String id,String name,String nachname) {
		
		this.id = id;
		this.name = name;
		this.nachname = nachname;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTc() {
		return tc;
	}
	public void setTc(String tc) {
		this.tc = tc;
	}
	public void check(String x) {
		
		if(x.length() == 7) {
			for(int i=0;i<x.length();i++) {
				if(Character.isDigit(x.charAt(i))== true ){
					if(x.charAt(0)== '0'){
						throw new InvalidIDException("IDs muss nicht mit der Ziffer 0 anfangen");
					}	
				}else{
					throw new InvalidIDException("IDs muss nur aus Ziffern bestehen");
				}
			}	
		}else{
			throw new InvalidIDException("Bitte geben Sie eine 7-stellige ID");
		}
	}	
}		