package gob.mdmq.coretributario.msnegociogestiontributo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TributoDTO{

	private Long tributoId;
	
	private Long claseTributoId;
	
	private String descripcionTributo;
	
	private String declarativo;

}
