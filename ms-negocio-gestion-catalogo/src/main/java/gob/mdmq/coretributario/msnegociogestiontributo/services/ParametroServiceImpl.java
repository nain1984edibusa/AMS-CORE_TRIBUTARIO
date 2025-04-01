package gob.mdmq.coretributario.msnegociogestiontributo.services;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import gob.mdmq.coretributario.msnegociogestiontributo.dto.ParametroDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.mappers.ParametroMapper;
import gob.mdmq.coretributario.msnegociogestiontributo.repository.ParametroRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RequiredArgsConstructor
@Service
public class ParametroServiceImpl implements ParametroService {

	private final ParametroRepository parametroRepository;
	private final ParametroMapper parametroMapper;
	 
	 
	@Override
	@CircuitBreaker(name = "cbConsultarParametro", fallbackMethod = "fallbackFindAll")
	public List<ParametroDTO> findAll() throws ServiceException {
		// Simula una falla real (esto lo puedes quitar cuando pruebes contra el mock)
        if (true) throw new RuntimeException("Falla forzada para probar el CircuitBreaker");
        
		return this.parametroMapper.toDTO(this.parametroRepository.findAll());
	}

	// Método fallback
    public List<ParametroDTO> fallbackFindAll(Throwable t) {
        // Podrías loguear la excepción aquí si lo deseas
        //log.error("Error en findAll", t);
        return Collections.emptyList(); // o una lista por defecto
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

	@Override
//	@CircuitBreaker(name = "miCircuitBreaker1", fallbackMethod = "fallbackMethod")
    public String processPayment() throws ServiceException{
		 try {
	            return "Pago procesado correctamente";
	        } catch (Exception ex) {
	            throw ex;
	        }
		 //Simula una falla intencional
        //throw new RuntimeException("Servicio de pagos no disponible");
    }
}
