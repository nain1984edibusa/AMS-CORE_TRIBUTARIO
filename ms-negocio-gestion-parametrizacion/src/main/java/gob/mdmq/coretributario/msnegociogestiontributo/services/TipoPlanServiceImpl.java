package gob.mdmq.coretributario.msnegociogestiontributo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import gob.mdmq.coretributario.msnegociogestiontributo.dto.TipoPlanDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.mappers.TipoPlanMapper;
import gob.mdmq.coretributario.msnegociogestiontributo.repository.TipoPlanRepository;

@RequiredArgsConstructor
@Service
public class TipoPlanServiceImpl implements TipoPlanService {

	private final TipoPlanRepository tipoPlanRepository;
	private final TipoPlanMapper tipoPlanMapper;

	@Override
	public List<TipoPlanDTO> findAll() throws ServiceException {

		return this.tipoPlanMapper.toDTO(this.tipoPlanRepository.findAll());
	}

	@Override
	public List<TipoPlanDTO> findByLikeObject(TipoPlanDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoPlanDTO save(TipoPlanDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoPlanDTO update(TipoPlanDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<TipoPlanDTO> findById(Long id) throws ServiceException {
		return Optional.ofNullable(tipoPlanMapper.toDTO(tipoPlanRepository.findById(id).get()));
	}

}
