
  package gob.mdmq.coretributario.msnegociogestiontributo.mappers;
  
  import java.util.List;

import gob.mdmq.coretributario.msnegociogestiontributo.dto.TipoContribuyenteDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.entity.TipoContribuyenteEntity;
  
  public interface TipoContribuyenteMapper {
  
	  TipoContribuyenteDTO toDTO(TipoContribuyenteEntity e);
  
	  List<TipoContribuyenteDTO> toDTO(List<TipoContribuyenteEntity>lst);
  }
 