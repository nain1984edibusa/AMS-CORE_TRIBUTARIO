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
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Parametro")
@Table(name = "COR_PARAMETROS", catalog = "MDMQ_CORE_TRIBUTARIO", schema = "CORE")
public class ParametroEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "PARAMETRO_ID")
	private Long parametroId;
	
	@Column(name = "DESCRIPCION_PARAMETRO")
	private String descripcionParametro;
	
	@Column(name = "VALOR_NUMERICO")
	private BigDecimal valorNumerico;
	
	@Column(name = "VALOR_CARACTER")
	private String valorCaracter;
}
