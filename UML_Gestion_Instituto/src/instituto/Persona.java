package instituto;

import java.util.List;

public class Persona {

	/*Atributos de la Clase */
	private String email_institucional;
	private String clave_acceso;
	private List <Rendimiento> rendimientos;
	
	/**
	 * @return the rendimientos
	 */
	public List<Rendimiento> getRendimientos() {
		return rendimientos;
	}

	/**
	 * @param rendimientos the rendimientos to set
	 */
	public void setRendimientos(List<Rendimiento> rendimientos) {
		this.rendimientos = rendimientos;
	}

	/*Constructor de la Clase */
	public Persona () {
		
	}

	/**
	 * @return the email_institucional
	 */
	public String getEmail_institucional() {
		return email_institucional;
	}

	/**
	 * @param email_institucional the email_institucional to set
	 */
	public void setEmail_institucional(String email_institucional) {
		this.email_institucional = email_institucional;
	}

	/**
	 * @return the clave_acceso
	 */
	public String getClave_acceso() {
		return clave_acceso;
	}

	/**
	 * @param clave_acceso the clave_acceso to set
	 */
	public void setClave_acceso(String clave_acceso) {
		this.clave_acceso = clave_acceso;
	}
	
		
}
