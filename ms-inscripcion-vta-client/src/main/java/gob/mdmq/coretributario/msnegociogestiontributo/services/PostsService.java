package gob.mdmq.coretributario.msnegociogestiontributo.services;

import gob.mdmq.coretributario.msnegociogestiontributo.dto.PostsDto;

import reactor.core.publisher.*;

public interface PostsService {

	Flux<PostsDto> obtenerInformacion();
}
