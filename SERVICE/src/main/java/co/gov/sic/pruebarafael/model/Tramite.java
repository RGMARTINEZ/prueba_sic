package co.gov.sic.pruebarafael.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tramites")
public class Tramite {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;

	@Column(name = "anioRadicacion")
	private int anioRadicacion;

	@Column(name = "numeroRadicado")
	private String numeroRadicado;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "idFuncionarioRecibio")
	private int idFuncionarioRecibio;

	@Column(name = "idPersonaRadico")
	private int idPersonaRadico;

	
	public Tramite() {

	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public int getAnioRadicacion() {
		return anioRadicacion;
	}


	public void setAnioRadicacion(int anioRadicacion) {
		this.anioRadicacion = anioRadicacion;
	}


	public String getNumeroRadicado() {
		return numeroRadicado;
	}


	public void setNumeroRadicado(String numeroRadicado) {
		this.numeroRadicado = numeroRadicado;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getIdFuncionarioRecibio() {
		return idFuncionarioRecibio;
	}


	public void setIdFuncionarioRecibio(int idFuncionarioRecibio) {
		this.idFuncionarioRecibio = idFuncionarioRecibio;
	}


	public int getIdPersonaRadico() {
		return idPersonaRadico;
	}


	public void setIdPersonaRadico(int idPersonaRadico) {
		this.idPersonaRadico = idPersonaRadico;
	}

}
