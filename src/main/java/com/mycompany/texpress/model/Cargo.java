package com.mycompany.texpress.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="cargo")
public class Cargo implements Serializable{

	
	private static final long serialVersionUID = 1L;
   
	@Id
	@Column(name="idcargo")
	   private int cargo;
	@Column(name="nomcargo")
	   private String nombrecargo;
	@Column(name="nomina")
	   private int nomina;
	@Column(name="funcion")
	   private String  funcioncargo;
	@Column(name="estadocargo")
	   private String estadocargo;
	
	@OneToMany(mappedBy = "cargo")
	private List<Cargo> lstcargo;
	
	
	
	public int getCargo() {
		return cargo;	
	}
	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
	public String getNombrecargo() {
		return nombrecargo;
	}
	public void setNombrecargo(String nombrecargo) {
		this.nombrecargo = nombrecargo;
	}
	public int getNomina() {
		return nomina;
	}
	public void setNomina(int nomina) {
		this.nomina = nomina;
	}
	public String getFuncioncargo() {
		return funcioncargo;
	}
	public void setFuncioncargo(String funcioncargo) {
		this.funcioncargo = funcioncargo;
	}
	public String getEstadocargo() {
		return estadocargo;
	}
	public void setEstadocargo(String estadocargo) {
		this.estadocargo = estadocargo;
	}
	
	
	
	
}
