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
@Table(name = "ordenes_de_servicio")
public class OrdenesDeServicio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ordenes_de_servicio_id;

	@Column(nullable = false)
	private Date fecha_de_creacion;
	
	@Column(nullable = true)
	private Date fecha_de_asignacion;
	
	@Column(nullable = true)
	private Date fecha_de_llegada;
	
	@Column(nullable = true)
	private Date fecha_de_resolucion;
	
	@Column(nullable = true)
	private Date fecha_de_cancelacion;
	
	@Column(nullable = true)
	private Date fecha_de_cierre;
	
	@Column(length = 15,nullable = false)
	private String estado;

	@Column(length = 255, nullable = true)
	private String descripcion_del_problema;
	
	@Column(length = 255, nullable = true)
	private String imagen_url;

	@Column(length = 18, nullable = true)
	private String motivo_cancelacion;
	
	@Column(length = 1, nullable = true)
	private Character revisada;

}
