package gob.mdmq.coretributario.msnegociogestiontributo.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ParametroDTO{

	private Long parametroId;
		
	private String descripcionParametro;
	
	private BigDecimal valorNumerico;
	
	private String valorCaracter;

}
