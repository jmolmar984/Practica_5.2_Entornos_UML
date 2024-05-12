package instituto;

import java.sql.Date;
import java.util.List;


enum Nivel{
	SECUNDARIA, BACHILLERATO
}

public class Alumno extends Persona {


	/* Atributos de la clase*/
	private String dni;
	private Date fecha_ingreso_centro;
	private Nivel nivel_educativo;
	private List <Sesion_Educativa> sesiones_educativas;
	
	/*Constructor de la clase */
    public Alumno () {
    	
    }

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the fecha_ingreso_centro
	 */
	public Date getFecha_ingreso_centro() {
		return fecha_ingreso_centro;
	}

	/**
	 * @param fecha_ingreso_centro the fecha_ingreso_centro to set
	 */
	public void setFecha_ingreso_centro(Date fecha_ingreso_centro) {
		this.fecha_ingreso_centro = fecha_ingreso_centro;
	}

	/**
	 * @return the nivel_educativo
	 */
	public Nivel getNivel_educativo() {
		return nivel_educativo;
	}

	/**
	 * @param nivel_educativo the nivel_educativo to set
	 */
	public void setNivel_educativo(Nivel nivel_educativo) {
		this.nivel_educativo = nivel_educativo;
	}

	public List <Sesion_Educativa> getSesiones_educativas() {
		return sesiones_educativas;
	}

	public void setSesiones_educativas(List <Sesion_Educativa> sesiones_educativas) {
		this.sesiones_educativas = sesiones_educativas;
	}
    
    
	
	
}
