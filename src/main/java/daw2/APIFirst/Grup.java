package daw2.APIFirst;

public class Grup{
	//Atributs
	
	private String nomGrup;
	private String cicle;
	private int curs;
	private int aula;
	
	
	//Setters i getters
	public String getNomGrup() {
		return nomGrup;
	}
	public void setNomGrup(String nomGrup) {
		this.nomGrup = nomGrup;
	}
	public String getCicle() {
		return cicle;
	}
	public void setCicle(String cicle) {
		this.cicle = cicle;
	}
	public int getCurs() {
		return curs;
	}
	public void setCurs(int curs) {
		this.curs = curs;
	}
	public int getAula() {
		return aula;
	}
	public void setAula(int aula) {
		this.aula = aula;
	}
	
	//to String
	@Override
	public String toString() {
		return "Grup [nomGrup=" + nomGrup + ", cicle=" + cicle + ", curs=" + curs + ", aula=" + aula + "]";
	}
	
	//Constructors
	public Grup(String nomGrup, String cicle, int curs, int aula) {
		super();
		this.nomGrup = nomGrup;
		this.cicle = cicle;
		this.curs = curs;
		this.aula = aula;
	}
	
	public Grup() {
		
	}
	
	
	
}
