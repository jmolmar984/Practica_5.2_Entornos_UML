package instituto;

import java.sql.Date;

public class Mensaje {

	/*Atributos de la clase */
	private Date momento_envio;
	private String contenido_mensaje;
	private Persona remitente;
	private Persona destinatario;
	
	/*Constructor de la clase */
	public Mensaje () {
		
	}

	/**
	 * @return the momento_envio
	 */
	public Date getMomento_envio() {
		return momento_envio;
	}

	/**
	 * @param momento_envio the momento_envio to set
	 */
	public void setMomento_envio(Date momento_envio) {
		this.momento_envio = momento_envio;
	}

	/**
	 * @return the contenido_mensaje
	 */
	public String getContenido_mensaje() {
		return contenido_mensaje;
	}

	/**
	 * @param contenido_mensaje the contenido_mensaje to set
	 */
	public void setContenido_mensaje(String contenido_mensaje) {
		this.contenido_mensaje = contenido_mensaje;
	}

	/**
	 * @return the remitente
	 */
	public Persona getRemitente() {
		return remitente;
	}

	/**
	 * @param remitente the remitente to set
	 */
	public void setRemitente(Persona remitente) {
		this.remitente = remitente;
	}

	/**
	 * @return the destinatario
	 */
	public Persona getDestinatario() {
		return destinatario;
	}

	/**
	 * @param destinatario the destinatario to set
	 */
	public void setDestinatario(Persona destinatario) {
		this.destinatario = destinatario;
	}
	
	
	
	
}
