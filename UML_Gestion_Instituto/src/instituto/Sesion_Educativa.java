package instituto;

import java.sql.Date;

public class Sesion_Educativa {

	/* Atributos de la Clase */
	private Date fecha_ejecucion;
	private int cantidad_alumnos;
	private String lugar_centro;
	private String tematica;
	private String explicacion;
	private String imagen;
	private String tiempo_estimado;
	private String [] recursos_didacticos;
	
	
	/*Constructor de la clase */
	public Sesion_Educativa () {
		
	}

	/**
	 * @return the fecha_ejecucion
	 */
	public Date getFecha_ejecucion() {
		return fecha_ejecucion;
	}

	/**
	 * @param fecha_ejecucion the fecha_ejecucion to set
	 */
	public void setFecha_ejecucion(Date fecha_ejecucion) {
		this.fecha_ejecucion = fecha_ejecucion;
	}

	/**
	 * @return the cantidad_alumnos
	 */
	public int getCantidad_alumnos() {
		return cantidad_alumnos;
	}

	/**
	 * @param cantidad_alumnos the cantidad_alumnos to set
	 */
	public void setCantidad_alumnos(int cantidad_alumnos) {
		this.cantidad_alumnos = cantidad_alumnos;
	}

	/**
	 * @return the lugar_centro
	 */
	public String getLugar_centro() {
		return lugar_centro;
	}

	/**
	 * @param lugar_centro the lugar_centro to set
	 */
	public void setLugar_centro(String lugar_centro) {
		this.lugar_centro = lugar_centro;
	}

	/**
	 * @return the tematica
	 */
	public String getTematica() {
		return tematica;
	}

	/**
	 * @param tematica the tematica to set
	 */
	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	/**
	 * @return the explicacion
	 */
	public String getExplicacion() {
		return explicacion;
	}

	/**
	 * @param explicacion the explicacion to set
	 */
	public void setExplicacion(String explicacion) {
		this.explicacion = explicacion;
	}

	/**
	 * @return the imagen
	 */
	public String getImagen() {
		return imagen;
	}

	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	/**
	 * @return the tiempo_estimado
	 */
	public String getTiempo_estimado() {
		return tiempo_estimado;
	}

	/**
	 * @param tiempo_estimado the tiempo_estimado to set
	 */
	public void setTiempo_estimado(String tiempo_estimado) {
		this.tiempo_estimado = tiempo_estimado;
	}

	/**
	 * @return the recursos_didacticos
	 */
	public String[] getRecursos_didacticos() {
		return recursos_didacticos;
	}

	/**
	 * @param recursos_didacticos the recursos_didacticos to set
	 */
	public void setRecursos_didacticos(String[] recursos_didacticos) {
		this.recursos_didacticos = recursos_didacticos;
	}
	
	
	
}
