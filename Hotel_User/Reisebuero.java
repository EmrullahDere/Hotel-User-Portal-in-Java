import java.util.ArrayList;
import java.util.Date;

public class Reisebuero implements ReisebueroSchnittstelle{

    private ArrayList<Mitarbeiter> mitarbeiter = new ArrayList();
    private ArrayList<Kunde> kunden = new ArrayList();
    private ArrayList<Reisepaket> reisepaket =new ArrayList();

  public void addKunde(Kunde k){
    
    kunden.add(k);
  }

  public void addMitarbeiter(Mitarbeiter m){

    mitarbeiter.add(m);
  }

  public void addReisepaket(Reisepaket rp){

    reisepaket.add(rp);
  }
  //Funktion geschrieben, um Ihre Kundengröße zu finden
  public int sizeOfreisepaket(){ 
    
    return reisepaket.size()+1;
  }
  public Kunde getKunde(String id){
    
    return (kunden.get(kunden.indexOf(new Kunde(id))));  
  }
  public Mitarbeiter getMitarbeiter(String id){
  
    return (mitarbeiter.get(mitarbeiter.indexOf(new Mitarbeiter(id))));
  }
  public Reisepaket getReisepaket(int id){

    return (reisepaket.get(reisepaket.indexOf(new Reisepaket(id))));
  }

  public void printKunden(){
    for(int i=0;i<kunden.size();i++) {  		
      System.out.println(kunden.get(i));
    }
  }

  public void printMitarbeiter(){
    for(int i=0;i<mitarbeiter.size();i++) {
      //Mitarbeiter m=(Mitarbeiter)mitarbeiter.get(i);
      System.out.println(mitarbeiter.get(i));
    }
  }
  public void printAlleReisepakete(){
    for(int i=0;i<reisepaket.size();i++) {
      
      Reisepaket rr= reisepaket.get(i);
      System.out.println(rr);    		  
    }
  }
  public void printAktuelleReisepakete(){
    for(int i=0;i<reisepaket.size();i++) {
        	
      Reisepaket rr= reisepaket.get(i);  		
      Date heute = new Date();
      
      if(rr.getStartdatum().after(heute)==true ){
        System.out.println(rr);
      }
    }
  }
  public void removeMitarbeiter(String id){
     
    mitarbeiter.remove(new Mitarbeiter(id,"",""));
  }
  public void removeKunde(String id){
      
    for(int i=0;i<kunden.size();i++) {
         	
      Kunde k1=kunden.get(i);
    	if(k1.getId().equals(id)) {
    		kunden.remove(i);
      }
    }
  }  
  public void removeReisepaket(int id){
    
    reisepaket.remove(new Reisepaket(id)); 
  }
  public void verkaufeReisepaket(String kunde_id, int rp_id){
   
   if(kunden.contains(new Kunde(kunde_id))){
   	  if(reisepaket.contains(new Reisepaket(rp_id))){
   	          		
   	    int ix=kunden.indexOf(new Kunde(kunde_id));
   	    Kunde kx=kunden.get(ix);
   	          		
   	    int ix2=reisepaket.indexOf(new Reisepaket((rp_id)));
   	    Reisepaket rr=reisepaket.get(ix2);
   	    kx.addReisepaket(rr);
   	        
   	  }else{
				System.out.println("Bitte geben Sie ID von Reisepaket ein:");
			} 	
    }else {
		  System.out.println("Geben Sie rictige Kunde Id ein!");
    }
  }
  public void printverkaufeReisepaket(String kundeid){
    
    if(kunden.contains(new Kunde(kundeid))){
      Kunde kk1=kunden.get(kunden.indexOf(new Kunde(kundeid)));
     	kk1.readReisepaket();
    }else {
 			System.out.println("Geben Sie rictige Kunde Id ein!");
 		}
  }
}


  
