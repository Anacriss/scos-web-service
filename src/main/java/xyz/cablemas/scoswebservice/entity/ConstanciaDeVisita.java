package xyz.cablemas.scoswebservice.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "constancias_de_visita")
public class ConstanciaDeVisita implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long constancia_de_visita_id;
	
	@Column(length = 255, nullable = true)
	private String imagen_url;
	
	@Column(nullable = false)
	private Date fecha_de_creacion;
	

}
