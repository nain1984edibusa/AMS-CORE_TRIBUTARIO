package gob.mdmq.coretributario.msadministracionserversecurityjwt.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gob.mdmq.coretributario.msadministracionserversecurityjwt.dto.ClienteDTO;
import gob.mdmq.coretributario.msadministracionserversecurityjwt.entity.Usuario;
import gob.mdmq.coretributario.msadministracionserversecurityjwt.services.ClienteService;
import gob.mdmq.coretributario.msadministracionserversecurityjwt.services.ServiceException;

@RestController
@RequestMapping("api/v1")
public class HomeController {

	private final ClienteService clienteService;
	

	public HomeController(final ClienteService clienteService) {
		this.clienteService = clienteService;
	}

    @GetMapping("/public")
    public String homePublic(){
        return "Pagina de inicio al publico";
    } // fin de la peticion
   
  
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