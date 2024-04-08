package gob.mdmq.coretributario.msnegociogestioncontribuyente.mappers;

import java.util.List;
import gob.mdmq.coretributario.msnegociogestioncontribuyente.dto.ClienteDTO;
import gob.mdmq.coretributario.msnegociogestioncontribuyente.entity.ClienteEntity;

public interface ClienteMapper {

	ClienteDTO toDTO(ClienteEntity e);
	
	List<ClienteDTO> toDTO(List<ClienteEntity>lst);
	
}
