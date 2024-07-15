package gob.mdmq.coretributario.msnegociogestiontributo.mappers;

import java.util.List;
import gob.mdmq.coretributario.msnegociogestiontributo.dto.InscripcionCorreoDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.entity.InscripcionCorreoEntity;

public interface InscripcionCorreoMapper {

	InscripcionCorreoDTO toDTO(InscripcionCorreoEntity e);
	
	List<InscripcionCorreoDTO> toDTO(List<InscripcionCorreoEntity>lst);
	
}
