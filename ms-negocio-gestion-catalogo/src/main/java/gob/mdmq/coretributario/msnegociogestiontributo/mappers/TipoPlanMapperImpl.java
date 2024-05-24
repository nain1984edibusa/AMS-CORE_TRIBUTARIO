package gob.mdmq.coretributario.msnegociogestiontributo.mappers;

import java.util.List;

import org.springframework.stereotype.Component;

import gob.mdmq.coretributario.msnegociogestiontributo.dto.TipoPlanDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.entity.TipoPlanEntity;

@Component
public class TipoPlanMapperImpl implements TipoPlanMapper {

	@Override
	public TipoPlanDTO toDTO(TipoPlanEntity e) {
		return TipoPlanDTO.builder().tipoPlanId(e.getTipoPlanId())
				.tipoProcesoId(e.getTipoProcesoId())
				.descripcionPlan(e.getDescripcionPlan()).build();
	}

	@Override
	public List<TipoPlanDTO> toDTO(List<TipoPlanEntity> lst) {
		return lst.stream().map(e -> toDTO(e)).toList();
	}
}