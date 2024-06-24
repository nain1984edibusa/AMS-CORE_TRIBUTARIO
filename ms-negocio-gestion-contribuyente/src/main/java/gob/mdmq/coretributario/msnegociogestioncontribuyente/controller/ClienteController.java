package gob.mdmq.coretributario.msnegociogestioncontribuyente.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gob.mdmq.coretributario.msnegociogestioncontribuyente.dto.ClienteDTO;
import gob.mdmq.coretributario.msnegociogestioncontribuyente.services.ClienteService;
import gob.mdmq.coretributario.msnegociogestioncontribuyente.services.ServiceException;

@CrossOrigin
@RestController
@RequestMapping("api/v1/contribuyente")
public class ClienteController {

	private final ClienteService clienteService;

	public ClienteController(final ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@GetMapping
	public List<ClienteDTO> findAll() throws ServiceException {
		return clienteService.findAll();
	}

	@GetMapping("/{id}")
	public ClienteDTO findById(@PathVariable("id") Long id) throws ServiceException {
		return clienteService.findById(id).get();
	}

	
	/*
	 * @GetMapping("/by-razonSocial") public List<ClienteEntity>
	 * findByLikeRazonSocial(@RequestParam String razonSocial) { return
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