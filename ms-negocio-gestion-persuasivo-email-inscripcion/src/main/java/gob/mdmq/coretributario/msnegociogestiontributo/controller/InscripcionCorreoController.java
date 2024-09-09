package gob.mdmq.coretributario.msnegociogestiontributo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
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
	 
	@GetMapping("/by-numeroRuc/{numeroRuc}")
    public ResponseEntity<List<InscripcionCorreoDTO>> findByNumeroRuc(@PathVariable("numeroRuc") String numeroRuc) {
        try {
            return ResponseEntity.ok(clienteService.findByNumeroRuc(numeroRuc));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();

        }
    }
	  
}