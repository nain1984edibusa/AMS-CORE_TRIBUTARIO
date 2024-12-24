package gob.mdmq.coretributario.msnegociogestiontributo.mappers;

import java.util.List;
import gob.mdmq.coretributario.msnegociogestiontributo.dto.InscripcionVtaDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.entity.InscripcionVtaEntity;

public interface InscripcionVtaMapper {

	InscripcionVtaDTO toDTO(InscripcionVtaEntity e);
	
	List<InscripcionVtaDTO> toDTO(List<InscripcionVtaEntity>lst);
	
}
