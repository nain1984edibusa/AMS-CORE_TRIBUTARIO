package gob.mdmq.coretributario.msnegociogestiontributo.dto;

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
public class TipoProcesoDTO{

	private Long tipoProcesoId;
	
	private Integer tipoUnidadCapacidadOperativaId;
	
	private String descripcionProceso;
	
	private Integer capacidadOperativa;
	
	private Date fechaInicio;
	
	private Date fechaFin;
}

