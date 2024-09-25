
  package gob.mdmq.coretributario.msnegociogestiontributo.mappers;
  
  import java.util.List;

import gob.mdmq.coretributario.msnegociogestiontributo.dto.ParametroDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.entity.ParametroEntity;
  
  public interface ParametroMapper {
  
  ParametroDTO toDTO(ParametroEntity e);
  
  List<ParametroDTO> toDTO(List<ParametroEntity>lst);
  }
 