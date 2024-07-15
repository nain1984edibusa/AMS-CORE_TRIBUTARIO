package gob.mdmq.coretributario.msnegociogestiontributo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import gob.mdmq.coretributario.msnegociogestiontributo.dto.TipoContribuyenteDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.mappers.TipoContribuyenteMapper;
import gob.mdmq.coretributario.msnegociogestiontributo.repository.TipoContribuyenteRepository;

@RequiredArgsConstructor
@Service
public class TipoContribuyenteServiceImpl implements TipoContribuyenteService {

	private final TipoContribuyenteRepository tipoContribuyenteRepository;
	private final TipoContribuyenteMapper tipoContribuyenteMapper;

	@Override
	public List<TipoContribuyenteDTO> findAll() throws ServiceException {

		return this.tipoContribuyenteMapper.toDTO(this.tipoContribuyenteRepository.findAll());
	}

	@Override
	public List<TipoContribuyenteDTO> findByLikeObject(TipoContribuyenteDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoContribuyenteDTO save(TipoContribuyenteDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoContribuyenteDTO update(TipoContribuyenteDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<TipoContribuyenteDTO> findById(Long id) throws ServiceException {
		return Optional.ofNullable(tipoContribuyenteMapper.toDTO(tipoContribuyenteRepository.findById(id).get()));
	}

}
