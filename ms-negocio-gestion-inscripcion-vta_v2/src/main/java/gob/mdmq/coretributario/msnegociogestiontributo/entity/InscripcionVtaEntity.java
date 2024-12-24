package gob.mdmq.coretributario.msnegociogestiontributo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.annotation.Immutable;

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
@Entity(name = "IncripcionVta")
@Table(name = "GBT_INSCRIPCION_VTA", catalog = "MDMQ_CORE_TRIBUTARIO", schema = "BRECHA")
@Immutable
public class InscripcionVtaEntity{

	@Id
	@Column(name = "NUMERO_RUC")
	private String numeroRuc;
	
	@Column(name = "RAZON_SOCIAL")
	private String razonSocial;
	
	@Column(name = "ANIO")
	private Short anio;
	
	@Column(name = "PERSONA_SOCIEDAD")
	private String personaSociedad;
	
	@Column(name = "OBLIGADO")
	private String obligado;
	
	@Column(name = "FECHA_SALIDA", nullable = true)
	private Date fechaSalida;
	
	@Column(name = "BASE_IMPONIBLE", nullable = true)
	private BigDecimal baseImponible;
		
	@Column(name = "TOTAL_PATRIMONIO_NETO", nullable = true)
	private BigDecimal totalPatrimonioNeto;
	
	@Column(name = "NUMERO_INTENTOS")
	private Integer numeroIntentos;
	
	@Column(name = "POTENCIAL_RECAUDAR")
	private BigDecimal potencialRecaudar;
	
	
}

