package instituto;

import java.sql.Date;
import java.util.List;

public class Docente extends Persona {

	/*Atributos de la Clase */
	private String nif;
	private Date fecha_inicio_laboral;
	private String area_conocimiento;
	private String horario_atencion;
	private List<Sesion_Educativa> sesiones_educativas;
	
	/*Constructor de la Clase */
	public Docente () {
		
	}

	/**
	 * @return the nif
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * @param nif the nif to set
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}

	/**
	 * @return the fecha_inicio_laboral
	 */
	public Date getFecha_inicio_laboral() {
		return fecha_inicio_laboral;
	}

	/**
	 * @param fecha_inicio_laboral the fecha_inicio_laboral to set
	 */
	public void setFecha_inicio_laboral(Date fecha_inicio_laboral) {
		this.fecha_inicio_laboral = fecha_inicio_laboral;
	}

	/**
	 * @return the area_conocimiento
	 */
	public String getArea_conocimiento() {
		return area_conocimiento;
	}

	/**
	 * @param area_conocimiento the area_conocimiento to set
	 */
	public void setArea_conocimiento(String area_conocimiento) {
		this.area_conocimiento = area_conocimiento;
	}

	/**
	 * @return the horario_atencion
	 */
	public String getHorario_atencion() {
		return horario_atencion;
	}

	/**
	 * @param horario_atencion the horario_atencion to set
	 */
	public void setHorario_atencion(String horario_atencion) {
		this.horario_atencion = horario_atencion;
	}

	public List<Sesion_Educativa> getSesiones_educativas() {
		return sesiones_educativas;
	}

	public void setSesiones_educativas(List<Sesion_Educativa> sesiones_educativas) {
		this.sesiones_educativas = sesiones_educativas;
	}
	
	
	
	
}
