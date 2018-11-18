package com.nelioalves.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// O pacote resource é o pacote de controllers no rest
@RestController

// Usar o request mapping com o nome do recurso (nesse caso categoria) no plural
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST funfa cachorro";
	}

}
