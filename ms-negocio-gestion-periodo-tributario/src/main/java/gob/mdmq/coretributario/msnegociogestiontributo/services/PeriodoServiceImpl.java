package gob.mdmq.coretributario.msnegociogestiontributo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import gob.mdmq.coretributario.msnegociogestiontributo.dto.PeriodoDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.mappers.PeriodoMapper;
import gob.mdmq.coretributario.msnegociogestiontributo.repository.PeriodoRepository;

@RequiredArgsConstructor
@Service
public class PeriodoServiceImpl implements PeriodoService {

	private final PeriodoRepository clienteRepository;
	private final PeriodoMapper clienteMapper;

	@Override
	public List<PeriodoDTO> findAll() throws ServiceException {

		return this.clienteMapper.toDTO(this.clienteRepository.findAll());
	}

	@Override
	public List<PeriodoDTO> findByLikeObject(PeriodoDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PeriodoDTO save(PeriodoDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PeriodoDTO update(PeriodoDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<PeriodoDTO> findById(Long id) throws ServiceException {
		return Optional.ofNullable(clienteMapper.toDTO(clienteRepository.findById(id).get()));
	}

}
