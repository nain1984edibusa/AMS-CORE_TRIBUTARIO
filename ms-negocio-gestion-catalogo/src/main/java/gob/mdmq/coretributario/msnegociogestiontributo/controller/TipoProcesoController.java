package gob.mdmq.coretributario.msnegociogestiontributo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gob.mdmq.coretributario.msnegociogestiontributo.dto.TipoProcesoDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.services.TipoProcesoService;
import gob.mdmq.coretributario.msnegociogestiontributo.services.ServiceException;

@CrossOrigin
@RestController
@RequestMapping("api/v1/tipo-proceso")
public class TipoProcesoController {

	private final TipoProcesoService clienteService;

	public TipoProcesoController(final TipoProcesoService clienteService) {
		this.clienteService = clienteService;
	}

	@GetMapping
	public List<TipoProcesoDTO> findAll() throws ServiceException {
		return clienteService.findAll();
	}

	@GetMapping("/{id}")
	public TipoProcesoDTO findById(@PathVariable("id") Long id) throws ServiceException {
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