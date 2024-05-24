package gob.mdmq.coretributario.msnegociogestiontributo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TipoPlanDTO{

	private Long tipoPlanId;
	
	private Long tipoProcesoId;
	
	private String descripcionPlan;
}
