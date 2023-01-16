package com.bpichincha.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "persona")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPersona;

	@NonNull
	@Size(min = 3, max = 70, message = "Nombres debe estar entre 3 y 70 caracteres.")
	@Column(name = "nombres", nullable = false, length = 70)
	private String nombre;

	@NonNull
	@Size(min = 1, max = 1, message = "Genero debe tener 1 caracter M: Masculino, F: Femenino")
	@Column(name = "genero", nullable = false, length = 1)
	private String genero;

	@NonNull
	@Min(value = 18, message = "Edad no podría ser menor de 18 años.")
	@Max(value = 65, message = "Edad no podría ser mayor de 65 años.")
	private Integer edad;

	@NonNull
	@Size(min = 10, max = 10, message = "Identificación debe tener 10 caracteres")
	@Column(name = "identificacion", nullable = false, length = 10)
	private String identificacion;

	@NonNull
	@Size(min = 10, max = 150, message = "Dirección debe tener maximo 150 caracteres")
	@Column(name = "direccion", nullable = false, length = 150)
	private String direccion;

	@NonNull
	@Size(min = 10, max = 10, message = "Teléfono debe tener 10 caracteres")
	@Column(name = "telefono", nullable = false, length = 10)
	private String telefono;

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	

}
