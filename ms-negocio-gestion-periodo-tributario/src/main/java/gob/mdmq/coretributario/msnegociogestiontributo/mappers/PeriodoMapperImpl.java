package gob.mdmq.coretributario.msnegociogestiontributo.mappers;

import java.util.List;

import org.springframework.stereotype.Component;

import gob.mdmq.coretributario.msnegociogestiontributo.dto.PeriodoDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.entity.PeriodoEntity;

@Component
public class PeriodoMapperImpl implements PeriodoMapper {

	@Override
	public PeriodoDTO toDTO(PeriodoEntity e) {
		return PeriodoDTO.builder().periodoId(e.getPeriodoId())
				.tipoPeriodicidadId(e.getTipoPeriodicidadId())
				.descripcionPeriodo(e.getDescripcionPeriodo())
				.anio(e.getAnio())
				.mes(e.getMes()).build();
	}

	@Override
	public List<PeriodoDTO> toDTO(List<PeriodoEntity> lst) {
		return lst.stream().map(e -> toDTO(e)).toList();
	}

}
