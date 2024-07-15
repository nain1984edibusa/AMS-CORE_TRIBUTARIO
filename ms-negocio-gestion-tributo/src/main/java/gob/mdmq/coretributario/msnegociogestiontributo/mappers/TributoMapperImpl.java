package gob.mdmq.coretributario.msnegociogestiontributo.mappers;

import java.util.List;

import org.springframework.stereotype.Component;

import gob.mdmq.coretributario.msnegociogestiontributo.dto.TributoDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.entity.TributoEntity;

@Component
public class TributoMapperImpl implements TributoMapper {

	@Override
	public TributoDTO toDTO(TributoEntity e) {
		return TributoDTO.builder().tributoId(e.getTributoId())
				.claseTributoId(e.getClaseTributoId())
				.descripcionTributo(e.getDescripcionTributo())
				.declarativo(e.getDeclarativo()).build();
	}

	@Override
	public List<TributoDTO> toDTO(List<TributoEntity> lst) {
		return lst.stream().map(e -> toDTO(e)).toList();
	}

}