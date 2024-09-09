package gob.mdmq.coretributario.msnegociogestioncontribuyente.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import gob.mdmq.coretributario.msnegociogestioncontribuyente.dto.ClienteDTO;
import gob.mdmq.coretributario.msnegociogestioncontribuyente.mappers.ClienteMapper;
import gob.mdmq.coretributario.msnegociogestioncontribuyente.repository.ClienteRepository;

@RequiredArgsConstructor
@Service
public class ClienteServiceImpl implements ClienteService {

	private final ClienteRepository clienteRepository;
	private final ClienteMapper clienteMapper;

	@Override
	public List<ClienteDTO> findAll() throws ServiceException {

		return this.clienteMapper.toDTO(this.clienteRepository.findAll());
	}

	@Override
	public List<ClienteDTO> findByLikeObject(ClienteDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteDTO save(ClienteDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteDTO update(ClienteDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<ClienteDTO> findById(Long id) throws ServiceException {
		return Optional.ofNullable(clienteMapper.toDTO(clienteRepository.findById(id).get()));
	}

	@Override
	public List<ClienteDTO> findByLikeRazonSocial(String razonSocial) throws ServiceException {

		return this.clienteMapper.toDTO(this.clienteRepository.findByLikeRazonSocial(razonSocial));
	}
}
