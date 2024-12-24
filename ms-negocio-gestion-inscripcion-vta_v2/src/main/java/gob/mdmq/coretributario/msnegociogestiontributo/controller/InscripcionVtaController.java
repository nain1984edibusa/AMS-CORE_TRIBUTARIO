package gob.mdmq.coretributario.msnegociogestiontributo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gob.mdmq.coretributario.msnegociogestiontributo.dto.InscripcionVtaDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.services.InscripcionVtaService;
import gob.mdmq.coretributario.msnegociogestiontributo.services.ServiceException;

@CrossOrigin
@RestController
@RequestMapping("api/v1/inscripcion-vta")
public class InscripcionVtaController {

	private final InscripcionVtaService clienteService;

	public InscripcionVtaController(final InscripcionVtaService clienteService) {
		this.clienteService = clienteService;
	}
	
	@GetMapping 
	public List<InscripcionVtaDTO> findAll() throws ServiceException { 
		  return clienteService.findAll(); 
	}
	 
	@GetMapping("/by-numeroRuc/{numeroRuc}")
    public ResponseEntity<List<InscripcionVtaDTO>> findByNumeroRuc(@PathVariable("numeroRuc") String numeroRuc) {
        try {
            return ResponseEntity.ok(clienteService.findByNumeroRuc(numeroRuc));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
	
	@GetMapping("/by-anio-obligado-personaSociedad/{anio}/{obligado}/{personaSociedad}")
    public ResponseEntity<List<InscripcionVtaDTO>> findByAnio(@PathVariable("anio") Short anio
    		, @PathVariable("obligado") String obligado
    		, @PathVariable("personaSociedad") String personaSociedad) {
        try {
            return ResponseEntity.ok(clienteService.findByAnioObligadoPersonaSociedad(anio, obligado, personaSociedad));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}