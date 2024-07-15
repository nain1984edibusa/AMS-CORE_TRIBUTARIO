package gob.mdmq.coretributario.msautorizacionserversecurity.mappers;

import java.util.List;
import gob.mdmq.coretributario.msautorizacionserversecurity.dto.ClienteDTO;
import gob.mdmq.coretributario.msautorizacionserversecurity.entity.ClienteEntity;

public interface ClienteMapper {

	ClienteDTO toDTO(ClienteEntity e);
	
	List<ClienteDTO> toDTO(List<ClienteEntity>lst);
	
}
