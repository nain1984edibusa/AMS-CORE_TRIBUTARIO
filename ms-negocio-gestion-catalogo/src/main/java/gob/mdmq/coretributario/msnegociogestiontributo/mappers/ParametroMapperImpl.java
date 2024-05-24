package gob.mdmq.coretributario.msnegociogestiontributo.mappers;

import java.util.List;

import org.springframework.stereotype.Component;

import gob.mdmq.coretributario.msnegociogestiontributo.dto.ParametroDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.entity.ParametroEntity;

@Component

public class ParametroMapperImpl implements ParametroMapper {

	@Override
	public ParametroDTO toDTO(ParametroEntity e) {
		return ParametroDTO.builder().parametroId(e.getParametroId())
				.descripcionParametro(e.getDescripcionParametro())
				.valorNumerico(e.getValorNumerico())
				.valorCaracter(e.getValorCaracter()).build();
	}
	
	@Override
	public List<ParametroDTO> toDTO(List<ParametroEntity> lst) {
		return lst.stream().map(e -> toDTO(e)).toList();
	}
}