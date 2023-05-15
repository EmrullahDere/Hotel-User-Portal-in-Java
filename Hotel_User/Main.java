//Emrullah Dere-180501036

import java.util.Date;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {

    Reisebuero reisebuero = new Reisebuero();
    Scanner sc = new Scanner(System.in);
    
    int operation = 0;
    while (operation != 100) {

      System.out.println("Welche Operation moechten Sie durchfuehren?");
      System.out.println("  1- Mitarbeiter hinzufuegen");
      System.out.println("  2- Mitarbeiter auflisten");
      System.out.println("  3- Mitarbeiter loeschen");
      System.out.println("  4- Kunde hinzufuegen");
      System.out.println("  5- Kunden auflisten");
      System.out.println("  6- Kunde loeschen");
      System.out.println("  7- Reisepaket hinzufuegen");
      System.out.println("  8- Reisepaket auflisten");
      System.out.println("  9- Reisepaket loeschen");
      System.out.println("  10- Reisepaket an Kunde verkaufen");
      System.out.println("  11- Reisepaket von Kunde auflisten");
      
      System.out.println("  100 - Programm beenden");

      operation = sc.nextInt();
      String empty = sc.nextLine();
      switch (operation) {
        
      	case 1:
          
      	  System.out.println("\nBitte geben Sie Ihre ID:");
        	String id = sc.nextLine();
		        
      	  System.out.println("Bitte geben Sie Ihre Name:");
		      String name = sc.nextLine();
		          
		      System.out.println("\nBitte geben Sie Ihre Nachname:");
		      String nachname = sc.nextLine();
		          
		      System.out.println("\nBitte geben Sie Ihre Tc:");
		      String tc = sc.nextLine();
		          
		      System.out.println("\nBitte geben Sie Ihre Gehalt:");
		      double gehalt = sc.nextDouble();
		        
		      System.out.println("\nBitte geben Sie Ihre Abschnittsname:");
		      String empty5 = sc.nextLine();
		      String abschnittsname = sc.nextLine();
		          
		      Mitarbeiter m = new Mitarbeiter(id,name,nachname);
		    
		      try {
		          m.check(id);
		        
		      }catch(InvalidIDException a) {
		        	
		      	System.out.println(a.getMessage());
		      }	
		       
		      reisebuero.addMitarbeiter(m);
	       
	        break;
            
        case 2:
        		
        	reisebuero.printMitarbeiter();
          
        	break;
        	
        case 3:
        
        	System.out.println("Bitte geben Sie die ID ein");
        	id = sc.next();
          
        	reisebuero.removeMitarbeiter(id);
          
        	break;
        case 4:
        	
        	System.out.println("\nBitte geben Sie Ihre ID:");
	        String kid = sc.nextLine();
        
        	System.out.println("Bitte geben Sie Ihre Name:");
          String kname = sc.nextLine();
            
          System.out.println("\nBitte geben Sie Ihre Nachname:");
          String knachname = sc.nextLine();
            
          System.out.println("\nBitte geben Sie Ihre Tc:");
          String ktc = sc.nextLine();
           
          System.out.println("\nBitte geben Sie Ihre Kontostand:");
          double konto_stand = sc.nextDouble();
            
          System.out.println("\nBitte geben Sie Ihr Pass:");
          String empty2 = sc.nextLine();
          String pass = sc.nextLine();
            
          Kunde k = new Kunde(kid,kname,knachname,konto_stand);
            
          try {
		        k.check(kid);
		        
		      }catch(InvalidIDException a) {
		    	  System.out.println(a.getMessage());
		      }	
          reisebuero.addKunde(k);
           
          break;
      
      	case 5:
      		
      	  reisebuero.printKunden();
      		
      		break;
      		
      	case 6:
             
         	System.out.println("Bitte geben Sie die ID ein");
         	id = sc.next();
         	
         	reisebuero.removeKunde(id);
         	break;
         	
      	case 7:
      		
        	System.out.println("Bitte geben Sie Ihre Destination:");
          String destination = sc.nextLine();
            
          System.out.println("\nBitte geben Sie Ihre Anzahl_der_Tage:");
          int Anzahl_der_Tage = sc.nextInt();
            
          System.out.println("\nBitte geben Sie Ihre Startdatum:(dd.mm.yyyy)");
            
          String empty4 = sc.nextLine();
          String Startdatum = sc.nextLine();
      
          System.out.println("\nBitte geben Sie Ihre Enddatum:(dd.mm.yyyy)");
          String Enddatum = sc.nextLine();
            
          if(Startdatum.length()==10&& Enddatum.length()==10) {
            	
            try {
              String day = Startdatum.substring(0,2);
            	int int_tag = Integer.parseInt(day);
              String month = Startdatum.substring(3,5);
              int int_month = Integer.parseInt(month)-1;
              String year = Startdatum.substring(6,10);
              int int_year = Integer.parseInt(year)-1900;
              Date startdatum = new Date(int_year,int_month,int_tag);
                   
              day = Enddatum.substring(0,2);
              int_tag = Integer.parseInt(day);
              month = Enddatum.substring(3,5);
              int_month = Integer.parseInt(month)-1;
              year = Enddatum.substring(6,10);
              int_year = Integer.parseInt(year)-1900;
              Date enddatum = new Date(int_year,int_month,int_tag);
                   
              Reisepaket r = new Reisepaket(reisebuero.sizeOfreisepaket(),destination,Anzahl_der_Tage,startdatum,enddatum);
              reisebuero.addReisepaket(r);
            }catch(NumberFormatException n) {
            	System.out.println("Bitte geben Sie richtige Datum ein");
            }
          }else{
            System.out.println("Bitte geben Sie richtige Datum ein");
          }
            break;
         	
      	case 8:
      		 
          reisebuero.printAktuelleReisepakete();
          
      		break;
        	
      	case 9:
      		 
        	System.out.println("Bitte geben Sie die ID ein");
        
        	String Paket_ID = sc.next();
        	reisebuero.removeReisepaket(Integer.parseInt(Paket_ID));
        	
        	break;
    
      	case 10:
      		
      		System.out.println("Bitte geben Sie ID von Kunde ein:");
      		String kkid = sc.next();

          System.out.println("Bitte geben Sie reispaket id ");
   	      String rpid = sc.next();

          reisebuero.verkaufeReisepaket(kkid,Integer.parseInt(rpid));
      		
      		break;
      		
      	case 11:
     		 
     		  System.out.println("Bitte geben Sie ID von Kunde ein:");
     		  String kkid2 = sc.next();
     		 
     		  reisebuero.printverkaufeReisepaket(kkid2);  
      		
          break;
         }
      }
   }
}