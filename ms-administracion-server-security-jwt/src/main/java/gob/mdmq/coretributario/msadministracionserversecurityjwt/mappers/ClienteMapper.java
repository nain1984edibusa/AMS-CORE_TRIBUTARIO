package gob.mdmq.coretributario.msadministracionserversecurityjwt.mappers;

import java.util.List;
import gob.mdmq.coretributario.msadministracionserversecurityjwt.dto.ClienteDTO;
import gob.mdmq.coretributario.msadministracionserversecurityjwt.entity.ClienteEntity;

public interface ClienteMapper {

	ClienteDTO toDTO(ClienteEntity e);
	
	List<ClienteDTO> toDTO(List<ClienteEntity>lst);
	
}
