
  package gob.mdmq.coretributario.msnegociogestiontributo.mappers;
  
  import java.util.List;

import gob.mdmq.coretributario.msnegociogestiontributo.dto.TipoPlanDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.entity.TipoPlanEntity;
  
  public interface TipoPlanMapper {
  
	  TipoPlanDTO toDTO(TipoPlanEntity e);
  
  List<TipoPlanDTO> toDTO(List<TipoPlanEntity>lst);
  }
 