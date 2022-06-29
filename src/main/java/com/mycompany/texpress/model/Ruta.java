package com.mycompany.texpress.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="ruta")
public class Ruta  implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codruta")
	private int codruta;
	@Column(name="origenruta")
	private String origenruta;
	@Column(name="destinoruta")
	private String destinoruta;
	
	
	/* ruta a usuario*/
    @ManyToOne()
    @JoinColumn(name="usuario_idusuario")
    private Usuario usuario;
    
    /* ruta a servicio*/
    @ManyToOne()
    @JoinColumn(name="servicio_idservicio")
    private Servicio servicio;
    
    
    
    
	
	public int getCodruta() {
		return codruta;
	}
	public void setCodruta(int codruta) {
		this.codruta = codruta;
	}
	public String getOrigenruta() {
		return origenruta;
	}
	public void setOrigenruta(String origenruta) {
		this.origenruta = origenruta;
	}
	public String getDestinoruta() {
		return destinoruta;
	}
	public void setDestinoruta(String destinoruta) {
		this.destinoruta = destinoruta;
	}
	
	
	
	
	
	
	
}
