package gob.mdmq.coretributario.msnegociogestiontributo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import gob.mdmq.coretributario.msnegociogestiontributo.dto.InscripcionCorreoDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.mappers.InscripcionCorreoMapper;
import gob.mdmq.coretributario.msnegociogestiontributo.repository.InscripcionCorreoRepository;

@RequiredArgsConstructor
@Service
public class InscripcionCorreoServiceImpl implements InscripcionCorreoService {

	private final InscripcionCorreoRepository clienteRepository;
	private final InscripcionCorreoMapper clienteMapper;


	@Override
	public List<InscripcionCorreoDTO> findAll() throws ServiceException {

		return this.clienteMapper.toDTO(this.clienteRepository.findAll());
	}
}
