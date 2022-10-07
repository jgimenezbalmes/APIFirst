package daw2.APIFirst;

import java.time.LocalDate;

public class Alumne {
	//Atributs
	private String nom;
	private String cognom1;
	private String cognom2;
	private LocalDate dataNaixement;
	private String dni;
	private int classestotals;
	private int faltes;
	private int faltesJust;
	
	//To string
	@Override
	public String toString() {
		return "Alumne [nom=" + nom + ", cognom1=" + cognom1 + ", cognom2=" + cognom2 + ", dataNaixement="
				+ dataNaixement + ", dni=" + dni + "]";
	}

	//Getters i setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom1() {
		return cognom1;
	}

	public void setCognom1(String cognom1) {
		this.cognom1 = cognom1;
	}

	public String getCognom2() {
		return cognom2;
	}

	public void setCognom2(String cognom2) {
		this.cognom2 = cognom2;
	}

	public LocalDate getDataNaixement() {
		return dataNaixement;
	}

	public void setDataNaixement(LocalDate dataNaixement) {
		this.dataNaixement = dataNaixement;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	//Constructors

	public Alumne(String nom, String cognom1, String cognom2, LocalDate dataNaixement, String dni) {
		super();
		this.nom = nom;
		this.cognom1 = cognom1;
		this.cognom2 = cognom2;
		this.dataNaixement = dataNaixement;
		this.dni = dni;
	}
	
	public Alumne() {
		
	}
	
	
}
