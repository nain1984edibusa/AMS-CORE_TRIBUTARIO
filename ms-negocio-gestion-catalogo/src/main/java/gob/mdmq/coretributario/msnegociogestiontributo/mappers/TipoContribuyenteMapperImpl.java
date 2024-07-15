package gob.mdmq.coretributario.msnegociogestiontributo.mappers;

import java.util.List;

import org.springframework.stereotype.Component;

import gob.mdmq.coretributario.msnegociogestiontributo.dto.TipoContribuyenteDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.entity.TipoContribuyenteEntity;

@Component


	
public class TipoContribuyenteMapperImpl implements TipoContribuyenteMapper {

	@Override
	public TipoContribuyenteDTO toDTO(TipoContribuyenteEntity e) {
		return TipoContribuyenteDTO.builder().tipoContribuyenteId(e.getTipoContribuyenteId())
				.descripcionContribuyente(e.getDescripcionContribuyente()).build();
	}

	@Override
	public List<TipoContribuyenteDTO> toDTO(List<TipoContribuyenteEntity> lst) {
		return lst.stream().map(e -> toDTO(e)).toList();
	}
}