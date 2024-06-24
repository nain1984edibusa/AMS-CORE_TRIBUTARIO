package gob.mdmq.coretributario.msnegociogestiontributo.mappers;

import java.util.List;
import gob.mdmq.coretributario.msnegociogestiontributo.dto.PeriodoDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.entity.PeriodoEntity;

public interface PeriodoMapper {

	PeriodoDTO toDTO(PeriodoEntity e);
	
	List<PeriodoDTO> toDTO(List<PeriodoEntity>lst);
	
}
