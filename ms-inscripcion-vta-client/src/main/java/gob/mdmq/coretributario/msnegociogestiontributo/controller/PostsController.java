package gob.mdmq.coretributario.msnegociogestiontributo.controller;

import gob.mdmq.coretributario.msnegociogestiontributo.dto.PostsDto;
import gob.mdmq.coretributario.msnegociogestiontributo.services.PostsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
//@RequestMapping("/posts")
public class PostsController {

    private final PostsService postsService;

    public PostsController(final PostsService postsService){
        this.postsService = postsService;
    }

//    @GetMapping("/inscripciones")
//    public Flux<PostsDto> getAllInscripciones() {
//        return postsService.findAll();
//    }
    
	@GetMapping(value = "/obtener-inscripcion", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Flux<PostsDto> streamAllTributos() {
		return postsService.obtenerInformacion();
	}
}
