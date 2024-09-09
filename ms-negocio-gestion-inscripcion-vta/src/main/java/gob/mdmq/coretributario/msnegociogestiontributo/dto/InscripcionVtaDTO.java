package gob.mdmq.coretributario.msnegociogestiontributo.dto;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InscripcionVtaDTO{

	private String numeroRuc;
	
	private String razonSocial;
	
	private Short anio;
	
	private String personaSociedad;
	
	private String obligado;
	
	private Date fechaSalida;
	
	private BigDecimal baseImponible;
		
	private Integer numeroIntentos;
	
	private BigDecimal potencialRecaudar;
	
	private BigDecimal totalPatrimonioNeto;

}
