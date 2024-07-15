
  package gob.mdmq.coretributario.msnegociogestiontributo.mappers;
  
  import java.util.List;

import gob.mdmq.coretributario.msnegociogestiontributo.dto.TipoProcesoDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.entity.TipoProcesoEntity;
  
  public interface TipoProcesoMapper {
  
	  TipoProcesoDTO toDTO(TipoProcesoEntity e);
  
	  List<TipoProcesoDTO> toDTO(List<TipoProcesoEntity>lst);
  }
 