package gob.mdmq.coretributario.msnegociogestiontributo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gob.mdmq.coretributario.msnegociogestiontributo.dto.PeriodoDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.services.PeriodoService;
import gob.mdmq.coretributario.msnegociogestiontributo.services.ServiceException;

@RestController
@RequestMapping("api/v1/periodo-tributario")
public class PeriodoController {

	private final PeriodoService clienteService;

	public PeriodoController(final PeriodoService clienteService) {
		this.clienteService = clienteService;
	}

	@GetMapping
	public List<PeriodoDTO> findAll() throws ServiceException {
		return clienteService.findAll();
	}

	@GetMapping("/{id}")
	public PeriodoDTO findById(@PathVariable("id") Long id) throws ServiceException {
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