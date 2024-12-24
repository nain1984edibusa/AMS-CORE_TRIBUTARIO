package gob.mdmq.coretributario.msnegociogestiontributo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import gob.mdmq.coretributario.msnegociogestiontributo.dto.InscripcionVtaDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.mappers.InscripcionVtaMapper;
import gob.mdmq.coretributario.msnegociogestiontributo.repository.InscripcionVtaRepository;

@RequiredArgsConstructor
@Service
public class InscripcionVtaServiceImpl implements InscripcionVtaService {

	private final InscripcionVtaRepository clienteRepository;
	private final InscripcionVtaMapper clienteMapper;


	@Override
	public List<InscripcionVtaDTO> findAll() throws ServiceException {

		return this.clienteMapper.toDTO(this.clienteRepository.findAll());
	}


	@Override
	public List<InscripcionVtaDTO> findByLikeObject(InscripcionVtaDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public InscripcionVtaDTO save(InscripcionVtaDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public InscripcionVtaDTO update(InscripcionVtaDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<InscripcionVtaDTO> findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	
	@Override
	public List<InscripcionVtaDTO> findByNumeroRuc(String numeroRuc) throws ServiceException  {
		
		return this.clienteMapper.toDTO(this.clienteRepository.findByNumeroRuc(numeroRuc));
	}
	
	@Override
	public List<InscripcionVtaDTO> findByAnioObligadoPersonaSociedad(Short anio, String obligado, String personaSociedad) throws ServiceException  {
		
		return this.clienteMapper.toDTO(this.clienteRepository.findByAnioObligadoPersonaSociedad(anio, obligado, personaSociedad));
	}

}
