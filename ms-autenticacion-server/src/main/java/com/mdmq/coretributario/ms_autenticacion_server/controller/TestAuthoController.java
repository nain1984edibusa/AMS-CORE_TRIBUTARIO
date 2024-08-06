package com.mdmq.coretributario.ms_autenticacion_server.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@PreAuthorize("denyAll()")

public class TestAuthoController {
	
	@GetMapping("/hello")
	@PreAuthorize("permitAll()")
    public String hello(){
        return "Hello World";
    }

	@GetMapping("/hello-security")
	@PreAuthorize("hasAnyAuthority('CREATE')")
    public String helloSecurity(){
        return "Hello World security";
    }
	
	@GetMapping("/get")
    public String helloGet(){
        return "Hello World - GET";
    }

    @PostMapping("/post")

    public String helloPost(){
        return "Hello World - POST";
    }

    @PutMapping("/put")
    public String helloPut(){
        return "Hello World - PUT";
    }

    @DeleteMapping("/delete")
    public String helloDelete(){
        return "Hello World - DELETE";
    }

    @PatchMapping("/patch")
    public String helloPatch(){
        return "Hello World - PATCH";
    }

}
