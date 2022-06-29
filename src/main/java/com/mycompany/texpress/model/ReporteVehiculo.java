package com.mycompany.texpress.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name ="reportevehiculo")
public class ReporteVehiculo  implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="idreporte")
	private int idreporte;
	@Column(name="diaentrega")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date reporteentrega;
	@Column(name="diallegada")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date reportellegada;
	@Column(name="estadovehiculo")
	private String estadovehiculo; 
	@Column(name="diareporte")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date diareporte;
	
	
	@ManyToOne()
	@JoinColumn(name ="usuario_idusuario")
	private  Usuario usuario;
	
	/* rv a vehiculo*/
	@ManyToOne()
	@JoinColumn(name ="vehiculo_matriculavehiculo")
	private Vehiculo vehiculo;
	
	
	
	
	
	public int getIdreporte() {
		return idreporte;
	}
	public void setIdreporte(int idreporte) {
		this.idreporte = idreporte;
	}
	public Date getReporteentrega() {
		return reporteentrega;
	}
	public void setReporteentrega(Date reporteentrega) {
		this.reporteentrega = reporteentrega;
	}
	public Date getReportellegada() {
		return reportellegada;
	}
	public void setReportellegada(Date reportellegada) {
		this.reportellegada = reportellegada;
	}
	public String getEstadovehiculo() {
		return estadovehiculo;
	}
	public void setEstadovehiculo(String estadovehiculo) {
		this.estadovehiculo = estadovehiculo;
	}
	public Date getDiareporte() {
		return diareporte;
	}
	public void setDiareporte(Date diareporte) {
		this.diareporte = diareporte;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
	
	
}
