package gob.mdmq.coretributario.msnegociogestiontributo.mappers;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import gob.mdmq.coretributario.msnegociogestiontributo.dto.InscripcionVtaDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.entity.InscripcionVtaEntity;
import gob.mdmq.coretributario.msnegociogestiontributo.services.ServiceException;

@Component
public class InscripcionVtaMapperImpl implements InscripcionVtaMapper {

	@Override
	public InscripcionVtaDTO toDTO(InscripcionVtaEntity e) {
		return InscripcionVtaDTO.builder().numeroRuc(e.getNumeroRuc())
				.razonSocial(e.getRazonSocial())
				.anio(e.getAnio())
				.personaSociedad(e.getPersonaSociedad())
				.obligado(e.getObligado())
				.fechaSalida(e.getFechaSalida())
				.baseImponible(e.getBaseImponible())
				.numeroIntentos(e.getNumeroIntentos())
				.potencialRecaudar(e.getPotencialRecaudar())
				.totalPatrimonioNeto(e.getTotalPatrimonioNeto()).build();
	}

	@Override
	public List<InscripcionVtaDTO> toDTO(List<InscripcionVtaEntity> lst) {
		return lst.stream().map(e -> toDTO(e)).toList();
	}
	

}
