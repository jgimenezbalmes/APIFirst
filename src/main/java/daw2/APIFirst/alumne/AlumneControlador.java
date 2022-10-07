package daw2.APIFirst.alumne;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import daw2.APIFirst.Alumne;
// Clase Controlador
@RestController
public class AlumneControlador {
	
	private static List<Alumne> llistatAssist01 = new ArrayList<>();
	static {
		llistatAssist01.add(new Alumne("Jonathan", "Valle", "Alfaro", 
				LocalDate.of(2002, Month.FEBRUARY, 20), "26634404J", 3,6,1));
		llistatAssist01.add(new Alumne("Gonzalo", "Mendoza", "Garcia",
				LocalDate.of(2004, Month.AUGUST, 18), "0046149D", 3,5,2));
		llistatAssist01.add(new Alumne("Carlos", "Hernandez", "Jorge",
				LocalDate.of(2001, Month.APRIL, 21), "84366915V", 3, 5, 2));
		llistatAssist01.add(new Alumne("Alexis", "Gutierrez", "Jorge", 
				LocalDate.of(2001, Month.AUGUST, 21), "34500288N", 4,3,1));

	}
	
	@GetMapping("api/alumne")
	public List<Alumne> getAlumnes(){
		List<Alumne> llistaAlumnes = new ArrayList<>();
		
		llistaAlumnes.add(new Alumne("Jonathan", "Valle", "Alfaro", 
				LocalDate.of(2002, Month.FEBRUARY, 20), "26634404J", 3,6,1));
		llistaAlumnes.add(new Alumne("Gonzalo", "Mendoza", "Garcia",
				LocalDate.of(2004, Month.AUGUST, 18), "0046149D", 3,5,2));
		llistaAlumnes.add(new Alumne("Carlos", "Hernandez", "Jorge",
				LocalDate.of(2001, Month.APRIL, 21), "84366915V", 3, 5, 2));
		llistaAlumnes.add(new Alumne("Alexis", "Gutierrez", "Jorge", 
				LocalDate.of(2001, Month.AUGUST, 21), "34500288N", 4,3,1));

	return llistaAlumnes;
	}
	
	@GetMapping("api/alumne/asistencia")
	public List<String> getAsistencia(){
		
		List<String> llistaAlumnes = new ArrayList<>();
		for (int i=0; i<llistatAssist01.size(); i++)
			llistaAlumnes.add("Nom: "+llistatAssist01.get(i).getNom()+ " cognom: "+ llistatAssist01.get(i).getCognom1() 
					+ " Faltes: " + llistatAssist01.get(i).getFaltes() 
					+ " Clases Totales: "+llistatAssist01.get(i).getClassestotals());
		
		return llistaAlumnes;
	}
	@GetMapping("api/alumne/{nElement}")
	public Alumne getAlumnes(@PathVariable int nElement){
		List<Alumne> llistaAlumnes = new ArrayList<>();
		
		llistaAlumnes.add(new Alumne("Jonathan", "Valle", "Alfaro",
				LocalDate.of(2002, Month.FEBRUARY, 20), "26634404J", 3,6,1));
		llistaAlumnes.add(new Alumne("Gonzalo", "Mendoza", "Garcia",
				LocalDate.of(2004, Month.AUGUST, 18), "0046149D", 3,5,2));
		llistaAlumnes.add(new Alumne("Carlos", "Hernandez", "Jorge",
				LocalDate.of(2001, Month.APRIL, 21), "84366915V", 3, 5, 2));
		llistaAlumnes.add(new Alumne("Alexis", "Gutierrez", "Jorge",
				LocalDate.of(2001, Month.AUGUST, 21), "34500288N", 4,3,1));

		return llistaAlumnes.get(nElement);
	}
	
}
