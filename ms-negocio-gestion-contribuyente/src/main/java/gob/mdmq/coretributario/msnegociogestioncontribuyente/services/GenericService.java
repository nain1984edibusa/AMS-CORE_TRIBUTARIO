package gob.mdmq.coretributario.msnegociogestioncontribuyente.services;

import java.util.List;
import java.util.Optional;

import gob.mdmq.coretributario.msnegociogestioncontribuyente.dto.ClienteDTO;

public interface GenericService<T> {

	List<T> findAll() throws ServiceException;
	
	List<T> findByLikeObject(T t) throws ServiceException;

	T save(T t) throws ServiceException;

	T update(T t) throws ServiceException;

	void delete(Long id) throws ServiceException;

	Optional<T> findById(Long id) throws ServiceException;

	List<T> findByLikeRazonSocial(String razonSocial) throws ServiceException;
}
