package gob.mdmq.coretributario.msnegociogestiontributo.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TipoProceso")
@Table(name = "GBT_TIPO_PROCESO", catalog = "MDMQ_CORE_TRIBUTARIO", schema = "CORE")
public class TipoProcesoEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "TIPO_PROCESO_ID")
	private Long tipoProcesoId;
	
	@Column(name = "TIPO_UNIDAD_CAP_OPE_ID")
	private Integer tipoUnidadCapacidadOperativaId;
	
	@Column(name = "DESCRIPCION_PROCESO")
	private String descripcionProceso;
	
	@Column(name = "CAPACIDAD_OPERATIVA")
	private Integer capacidadOperativa;
	
	@Column(name = "FECHA_INICIO")
	private Date fechaInicio;
	
	@Column(name = "FECHA_FIN")
	private Date fechaFin;
}

