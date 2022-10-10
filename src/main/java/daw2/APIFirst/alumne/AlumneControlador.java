package daw2.APIFirst.alumne;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import daw2.APIFirst.Alumne;
import daw2.APIFirst.Grup;
// Clase Controlador
@RestController
public class AlumneControlador {
	
	private static List<Alumne> llistatAssist01 = new ArrayList<>();
	static {
		llistatAssist01.add(new Alumne("Jonathan", "Valle", "Alfaro", 
				LocalDate.of(2002, Month.FEBRUARY, 20), "26634404J", 6,3,1, "Daw1", "jvalle@jaumebalmes.net"));
		llistatAssist01.add(new Alumne("Gonzalo", "Mendoza", "Garcia",
				LocalDate.of(2004, Month.AUGUST, 18), "0046149D", 5,3,2, "Dam2", "gmendoza@jaumebalmes.net"));
		llistatAssist01.add(new Alumne("Carlos", "Hernandez", "Jorge",
				LocalDate.of(2001, Month.APRIL, 21), "84366915V", 5, 1, 0, "Asix1", "chernandez@jaumebalmes.net"));
		llistatAssist01.add(new Alumne("Alexis", "Gutierrez", "Jorge", 
				LocalDate.of(2001, Month.AUGUST, 21), "34500288N", 4,2,1, "Smix2", "agutierrez@jaumebalmes.net"));

	}
	
	private static List<Grup> llistagrups = new ArrayList<>();
	static {
		llistagrups.add(new Grup("DAM1", "DAM", 1, 47));
		llistagrups.add(new Grup("DAW1", "DAW", 1, 51));
		llistagrups.add(new Grup("ASIX1", "ASIX", 1, 23));
		llistagrups.add(new Grup("DAW2", "DAW", 2, 41));
		llistagrups.add(new Grup("DAM2", "DAM", 2, 34));
		llistagrups.add(new Grup("ASIX2", "ASIX", 2, 21));
		llistagrups.add(new Grup("SMIX1", "SMIX", 1, 3));
		llistagrups.add(new Grup("SMIX2", "SMIX", 2, 11));
	}
	
	// Funcionalitat Api Alumne
	@GetMapping("api/alumne")
	public List<Alumne> getAlumnes(){
		
		return llistatAssist01;
		/*List<Alumne> llistaAlumnes = new ArrayList<>();
		
		llistaAlumnes.add(new Alumne("Jonathan", "Valle", "Alfaro", 
				LocalDate.of(2002, Month.FEBRUARY, 20), "26634404J", 6,3,1));
		llistaAlumnes.add(new Alumne("Gonzalo", "Mendoza", "Garcia",
				LocalDate.of(2004, Month.AUGUST, 18), "0046149D", 5,3,2));
		llistaAlumnes.add(new Alumne("Carlos", "Hernandez", "Jorge",
				LocalDate.of(2001, Month.APRIL, 21), "84366915V", 3, 5, 2));
		llistaAlumnes.add(new Alumne("Alexis", "Gutierrez", "Jorge", 
				LocalDate.of(2001, Month.AUGUST, 21), "34500288N", 4,3,1));

	return llistaAlumnes;*/
		
	}
	// Per número de Alumne
	@GetMapping("api/alumne/{nElement}")
	public Alumne getAlumnes(@PathVariable int nElement){
		
		
		/*List<Alumne> llistaAlumnes = new ArrayList<>();
		
		llistaAlumnes.add(new Alumne("Jonathan", "Valle", "Alfaro",
				LocalDate.of(2002, Month.FEBRUARY, 20), "26634404J", 3,6,1));
		llistaAlumnes.add(new Alumne("Gonzalo", "Mendoza", "Garcia",
				LocalDate.of(2004, Month.AUGUST, 18), "0046149D", 3,5,2));
		llistaAlumnes.add(new Alumne("Carlos", "Hernandez", "Jorge",
				LocalDate.of(2001, Month.APRIL, 21), "84366915V", 5, 1, 0));
		llistaAlumnes.add(new Alumne("Alexis", "Gutierrez", "Jorge",
				LocalDate.of(2001, Month.AUGUST, 21), "34500288N", 4,3,1));

		return llistaAlumnes.get(nElement);*/
		return llistatAssist01.get(nElement);
	}
	// Funcionalitat Api Asistencia
		@GetMapping("api/alumne/asistencia")
		public List<String> getAsistencia(){
			
			List<String> llistaAlumnes = new ArrayList<>();
			for (int i=0; i<llistatAssist01.size(); i++)
				llistaAlumnes.add("Nom: "+llistatAssist01.get(i).getNom()+ " Cognom: "+ llistatAssist01.get(i).getCognom1() 
						+ " Faltes: " + llistatAssist01.get(i).getFaltes() 
						+ " Classes Totals: "+llistatAssist01.get(i).getClassestotals()
						+ " Percentatge de faltes: "+(((double)llistatAssist01.get(i).getFaltes()*100)/(llistatAssist01.get(i).getClassestotals())) + " %");
			
			return llistaAlumnes;
		}
		// Per número de Asistencia
		@GetMapping("api/alumne/asistencia/{nElement}")
		public String getAsistencia(@PathVariable int nElement){
			
			List<String> llistaAlumnes = new ArrayList<>();
			for (int i=0; i<llistatAssist01.size(); i++)
				llistaAlumnes.add("Nom: "+llistatAssist01.get(i).getNom()+ " Cognom: "+ llistatAssist01.get(i).getCognom1() 
						+ " Faltes: " + llistatAssist01.get(i).getFaltes() 
						+ " Classes Totals: "+llistatAssist01.get(i).getClassestotals()
						+ " Percentatge de faltes: "+(((double)llistatAssist01.get(i).getFaltes()*100)/(llistatAssist01.get(i).getClassestotals())) + " %");
			
			return llistaAlumnes.get(nElement);
		}

		// Faltas justificadas	
		@GetMapping("api/alumne/faltes")
		public List<String> getFaltes(){
		    
		    List<String> llistaAlumnes = new ArrayList<>();
		    for (int i=0; i<llistatAssist01.size(); i++)
		        llistaAlumnes.add("Nom: "+llistatAssist01.get(i).getNom()+ " Cognom: "+ llistatAssist01.get(i).getCognom1() 
		                + " Faltes: " + llistatAssist01.get(i).getFaltes() 
		                + " Faltas justificadas: "+llistatAssist01.get(i).getFaltesJust()
		                + " Percentatge de faltes Justificadas: "+(((double)llistatAssist01.get(i).getFaltesJust()*100)/(llistatAssist01.get(i).getFaltes())) + " %");
		    
		    return llistaAlumnes;
		}
		
		@GetMapping("api/alumne/faltes/{nElement}")
		public String getFaltes(@PathVariable int nElement){
		    
		    List<String> llistaAlumnes = new ArrayList<>();
		    for (int i=0; i<llistatAssist01.size(); i++)
		        llistaAlumnes.add("Nom: "+llistatAssist01.get(i).getNom()+ " Cognom: "+ llistatAssist01.get(i).getCognom1() 
		                + " Faltes: " + llistatAssist01.get(i).getFaltes() 
		                + " Faltes Justificadas: "+llistatAssist01.get(i).getFaltesJust()
		                + " Percentatge de faltes Justificadas: "+(((double)llistatAssist01.get(i).getFaltesJust()*100)/(llistatAssist01.get(i).getFaltes())) + " %");
		    
		    return llistaAlumnes.get(nElement);
		}
		
		//Mapping per a retorn de grup
		@GetMapping("api/grup")
		public List<Grup> getGrup(){
			return llistagrups;
		}
}
