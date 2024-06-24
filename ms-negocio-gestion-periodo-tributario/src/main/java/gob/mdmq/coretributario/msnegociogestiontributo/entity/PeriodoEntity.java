package gob.mdmq.coretributario.msnegociogestiontributo.entity;

import java.io.Serializable;

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
@Entity(name = "Periodo")
@Table(name = "COR_PERIODO", catalog = "MDMQ_CORE_TRIBUTARIO", schema = "CORE")
public class PeriodoEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "PERIODO_ID")
	private Long periodoId;
	
	@Column(name = "TIPO_PERIODICIDAD_ID")
	private Long tipoPeriodicidadId;
	
	@Column(name = "DESCRIPCION_PERIODO")
	private String descripcionPeriodo;
	
	@Column(name = "ANIO")
	private String anio;
	
	@Column(name = "MES")
	private String mes;
}

