package com.mycompany.texpress.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="beneficios")
public class Beneficio implements Serializable {

	
	private static final long serialVersionUID = 1L;	
	 
	/*@GeneratedValue(strategy = GenerationType.IDENTITY)*/
	
	 @Id	 
	 @Column(name="idbeneficios")
	 private int id;
	 @Column(name="nombrebeneficio")
	 private String nombrebeneficio;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombrebeneficio() {
		return nombrebeneficio;
	}
	public void setNombrebeneficio(String nombrebeneficio) {
		this.nombrebeneficio = nombrebeneficio;
	}
	 
	
	 
	@ManyToOne()
	@JoinColumn(name ="usuario_idusuario")
	private Usuario usuario;
	 
	
	 
	 
	 
}
