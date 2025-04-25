package gob.mdmq.coretributario.msnegociogestiontributo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import gob.mdmq.coretributario.msnegociogestiontributo.dto.TipoPlanDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.services.TipoPlanService;
import gob.mdmq.coretributario.msnegociogestiontributo.services.ServiceException;

@CrossOrigin
@RestController
@RequestMapping("api/v1/tipo-plan")
public class TipoPlanController {

	private final TipoPlanService clienteService;

	public TipoPlanController(final TipoPlanService clienteService) {
		this.clienteService = clienteService;
	}

	@GetMapping
	public ResponseEntity<List<TipoPlanDTO>> findAll() throws ServiceException {
		try {
			return ResponseEntity.ok(clienteService.findAll());
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();

		}
	}
	
//	 @GetMapping("/{id}")
//	 public ResponseEntity<TipoPlanDTO> findById(@PathVariable("id") Long id) throws ServiceException {
//		    Optional<TipoPlanDTO> clienteOpt = clienteService.findById(id);
//
//		    if (clienteOpt.isPresent()) {
//		        return ResponseEntity.ok(clienteOpt.get());  //Devuelve 200 OK con el cliente
//		    } else {
//		        return ResponseEntity.notFound().build();    //Devuelve 404 Not Found
//		    }
//		}
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<TipoPlanDTO> findById(@PathVariable("id") Long id) throws ServiceException {
	     return clienteService.findById(id)
	             .map(ResponseEntity::ok)
	             .orElseGet(() -> ResponseEntity.notFound().build());
	 }
	 

//	@GetMapping("/{id}")
//	public TipoPlanDTO findById(@PathVariable("id") Long id) throws ServiceException {
//		return clienteService.findById(id).get();
//	}
	
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