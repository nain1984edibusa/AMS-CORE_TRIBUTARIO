package gob.mdmq.coretributario.msnegociogestiontributo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gob.mdmq.coretributario.msnegociogestiontributo.dto.InscripcionCorreoDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.services.InscripcionCorreoService;
import gob.mdmq.coretributario.msnegociogestiontributo.services.ServiceException;

@CrossOrigin
@RestController
@RequestMapping("api/v1/email-inscripcion")
public class InscripcionCorreoController {

	private final InscripcionCorreoService clienteService;

	public InscripcionCorreoController(final InscripcionCorreoService clienteService) {
		this.clienteService = clienteService;
	}
	
	@GetMapping 
	public List<InscripcionCorreoDTO> findAll() throws ServiceException { 
		  return clienteService.findAll(); 
	}
	 
	@GetMapping("/{numeroRuc}")
	public List<InscripcionCorreoDTO> findByNumeroRuc(@PathVariable("numeroRuc") String numeroRuc) throws ServiceException {
			return clienteService.findByNumeroRuc(numeroRuc);
	}
	  
		
	/*
	 * @GetMapping("/by-razonSocial") 
	 * public List<ClienteEntity> findByLikeRazonSocial(@RequestParam String razonSocial) { return
	 * clienteService.findByLikeRazonSocial(razonSocial); }
	 * 
	 * @GetMapping("/{id}") public Optional<ClienteEntity> findById(@PathVariable
	 * Long id) { return clienteService.findById(id); }
	 * 
	 * @PostMapping public ClienteEntity save(@RequestBody ClienteEntity
	 * clienteEntity) { return clienteService.save(clienteEntity); }
	 * 
	 * @PutMapping("/{id}") public ClienteEntity update(@PathVariable Long
	 * id, @RequestBody ClienteEntity clienteEntity) { clienteEntity.setId(id);
	 * return clienteService.update(clienteEntity); }
	 * 
	 * @DeleteMapping("/{id}") public void delete(@PathVariable Long id) {
	 * clienteService.delete(id); }
	 */
}