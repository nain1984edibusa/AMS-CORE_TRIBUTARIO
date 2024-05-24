package gob.mdmq.coretributario.msnegociogestiontributo.mappers;

import java.util.List;

import org.springframework.stereotype.Component;

import gob.mdmq.coretributario.msnegociogestiontributo.dto.TipoProcesoDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.entity.TipoProcesoEntity;

@Component
public class TipoProcesoMapperImpl implements TipoProcesoMapper {

	@Override
	public TipoProcesoDTO toDTO(TipoProcesoEntity e) {
		return TipoProcesoDTO.builder().tipoProcesoId(e.getTipoProcesoId())
				.tipoUnidadCapacidadOperativaId(e.getTipoUnidadCapacidadOperativaId())
				.descripcionProceso(e.getDescripcionProceso())
				.capacidadOperativa(e.getCapacidadOperativa())
				.fechaInicio(e.getFechaInicio())
				.fechaFin(e.getFechaFin()).build();
	}

	@Override
	public List<TipoProcesoDTO> toDTO(List<TipoProcesoEntity> lst) {
		return lst.stream().map(e -> toDTO(e)).toList();
	}
}