package gob.mdmq.coretributario.msnegociogestiontributo.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PeriodoDTO{

	private Long periodoId;
	
	private Long tipoPeriodicidadId;
	
	private String descripcionPeriodo;
	
	private String anio;
	
	private String mes;

}
