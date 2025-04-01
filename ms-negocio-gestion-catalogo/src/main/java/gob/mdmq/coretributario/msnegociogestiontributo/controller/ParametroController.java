package gob.mdmq.coretributario.msnegociogestiontributo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gob.mdmq.coretributario.msnegociogestiontributo.dto.ParametroDTO;
import gob.mdmq.coretributario.msnegociogestiontributo.services.ParametroService;
import gob.mdmq.coretributario.msnegociogestiontributo.services.ServiceException;

@CrossOrigin
@RestController
@RequestMapping("api/v1/parametro")
public class ParametroController {

	private final ParametroService clienteService;

	public ParametroController(final ParametroService clienteService) {
		this.clienteService = clienteService;
	}

	@GetMapping
	public List<ParametroDTO> findAll() throws ServiceException {
		return clienteService.findAll();
	}

	@GetMapping("/{id}")
	public ParametroDTO findById(@PathVariable("id") Long id) throws ServiceException {
		return clienteService.findById(id).get();
	}
	
	
	@GetMapping("/processPayment")  
	public String processPayment() throws ServiceException {
	    return clienteService.processPayment();
	 }
}