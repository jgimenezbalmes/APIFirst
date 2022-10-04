package daw2.APIFirst.alumne;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import daw2.APIFirst.Alumne;
// Clase Controlador
public class AlumneControlador {

	@GetMapping("/api/alumne")
	public List<Alumne> getAlumnes(){
		List<Alumne> llistaAlumnes = new ArrayList<>();
		
		llistaAlumnes.add(new Alumne("Jonathan", "Valle", 
				LocalDate.of(2002, Month.FEBRUARY, 20), "26634404J"));
		llistaAlumnes.add(new Alumne("Gonzalo", "Mendoza", 
				LocalDate.of(2004, Month.AUGUST, 18), "0046149D"));
		llistaAlumnes.add(new Alumne("Carlos", "Hernandez", 
				LocalDate.of(2001, Month.APRIL, 21), "84366915V"));
		llistaAlumnes.add(new Alumne("Alexis", "Gutierrez", 
				LocalDate.of(2001, Month.AUGUST, 21), "34500288N"));

	return llistaAlumnes;
	}
	
	@GetMapping("/api/alumne/{nElement}")
	public Alumne getAlumnes(@PathVariable int nElement){
		List<Alumne> llistaAlumnes = new ArrayList<>();
		
		llistaAlumnes.add(new Alumne("Jonathan", "Valle", 
				LocalDate.of(2002, Month.FEBRUARY, 20), "26634404J"));
		llistaAlumnes.add(new Alumne("Gonzalo", "Mendoza", 
				LocalDate.of(2004, Month.AUGUST, 18), "0046149D"));
		llistaAlumnes.add(new Alumne("Carlos", "Hernandez", 
				LocalDate.of(2001, Month.APRIL, 21), "84366915V"));
		llistaAlumnes.add(new Alumne("Alexis", "Gutierrez", 
				LocalDate.of(2001, Month.AUGUST, 21), "34500288N"));

		return llistaAlumnes.get(nElement);
	}
}
