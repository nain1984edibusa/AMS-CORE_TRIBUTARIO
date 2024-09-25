//package gob.mdmq.coretributario.msnegociogestiontributo.services;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.stereotype.Service;
//
//import lombok.RequiredArgsConstructor;
//import gob.mdmq.coretributario.msnegociogestiontributo.dto.TributoDTO;
//import gob.mdmq.coretributario.msnegociogestiontributo.mappers.TributoMapper;
//import gob.mdmq.coretributario.msnegociogestiontributo.repository.TributoRepository;
//
//@RequiredArgsConstructor
//@Service
//public class TributoServiceImpl implements TributoService {
//
//	private final TributoRepository clienteRepository;
//	private final TributoMapper clienteMapper;
//
//	@Override
//	public List<TributoDTO> findAll() throws ServiceException {
//
//		return this.clienteMapper.toDTO(this.clienteRepository.findAll());
//	}
//
//	@Override
//	public List<TributoDTO> findByLikeObject(TributoDTO t) throws ServiceException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public TributoDTO save(TributoDTO t) throws ServiceException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public TributoDTO update(TributoDTO t) throws ServiceException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void delete(Long id) throws ServiceException {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public Optional<TributoDTO> findById(Long id) throws ServiceException {
//		return Optional.ofNullable(clienteMapper.toDTO(clienteRepository.findById(id).get()));
//	}
//
//}
