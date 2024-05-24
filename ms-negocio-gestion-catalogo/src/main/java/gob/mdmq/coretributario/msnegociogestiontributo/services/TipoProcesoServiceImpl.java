package gob.mdmq.coretributario.msnegociogestiontributo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import gob.mdmq.coretributario.msnegociogestiontributo.dto.TipoProcesoDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.mappers.TipoProcesoMapper;
import gob.mdmq.coretributario.msnegociogestiontributo.repository.TipoProcesoRepository;

@RequiredArgsConstructor
@Service
public class TipoProcesoServiceImpl implements TipoProcesoService {

	private final TipoProcesoRepository tipoContribuyenteRepository;
	private final TipoProcesoMapper tipoContribuyenteMapper;

	@Override
	public List<TipoProcesoDTO> findAll() throws ServiceException {

		return this.tipoContribuyenteMapper.toDTO(this.tipoContribuyenteRepository.findAll());
	}

	@Override
	public List<TipoProcesoDTO> findByLikeObject(TipoProcesoDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoProcesoDTO save(TipoProcesoDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoProcesoDTO update(TipoProcesoDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<TipoProcesoDTO> findById(Long id) throws ServiceException {
		return Optional.ofNullable(tipoContribuyenteMapper.toDTO(tipoContribuyenteRepository.findById(id).get()));
	}

}
