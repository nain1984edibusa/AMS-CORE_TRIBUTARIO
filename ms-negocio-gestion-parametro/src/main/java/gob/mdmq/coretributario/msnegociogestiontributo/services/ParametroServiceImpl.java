package gob.mdmq.coretributario.msnegociogestiontributo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import gob.mdmq.coretributario.msnegociogestiontributo.dto.ParametroDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.mappers.ParametroMapper;
import gob.mdmq.coretributario.msnegociogestiontributo.repository.ParametroRepository;

@RequiredArgsConstructor
@Service
public class ParametroServiceImpl implements ParametroService {

	private final ParametroRepository parametroRepository;
	private final ParametroMapper parametroMapper;

	@Override
	public List<ParametroDTO> findAll() throws ServiceException {

		return this.parametroMapper.toDTO(this.parametroRepository.findAll());
	}

	@Override
	public List<ParametroDTO> findByLikeObject(ParametroDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParametroDTO save(ParametroDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParametroDTO update(ParametroDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<ParametroDTO> findById(Long id) throws ServiceException {
		return Optional.ofNullable(parametroMapper.toDTO(parametroRepository.findById(id).get()));
	}

}
