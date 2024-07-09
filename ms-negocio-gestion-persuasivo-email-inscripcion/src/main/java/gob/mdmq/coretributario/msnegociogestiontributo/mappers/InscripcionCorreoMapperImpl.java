package gob.mdmq.coretributario.msnegociogestiontributo.mappers;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import gob.mdmq.coretributario.msnegociogestiontributo.dto.InscripcionCorreoDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.entity.InscripcionCorreoEntity;
import gob.mdmq.coretributario.msnegociogestiontributo.services.ServiceException;

@Component
public class InscripcionCorreoMapperImpl implements InscripcionCorreoMapper {

	@Override
	public InscripcionCorreoDTO toDTO(InscripcionCorreoEntity e) {
		return InscripcionCorreoDTO.builder().numeroRuc(e.getNumeroRuc())
				.razonSocial(e.getRazonSocial())
				.anio(e.getAnio())
				.personaSociedad(e.getPersonaSociedad())
				.obligado(e.getObligado())
				.fechaInicio(e.getFechaInicio())
				.baseImponible(e.getBaseImponible())
				.numeroIntentos(e.getNumeroIntentos())
				.potencialRecaudar(e.getPotencialRecaudar())
				.totalPatrimonioNeto(e.getTotalPatrimonioNeto()).build();
	}

	@Override
	public List<InscripcionCorreoDTO> toDTO(List<InscripcionCorreoEntity> lst) {
		return lst.stream().map(e -> toDTO(e)).toList();
	}
	

}
