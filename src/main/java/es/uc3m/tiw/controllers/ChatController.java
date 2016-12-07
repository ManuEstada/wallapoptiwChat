package es.uc3m.tiw.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.uc3m.tiw.daos.ChatRepository;
import es.uc3m.tiw.dominios.Mensaje;



@CrossOrigin
@RestController
public class ChatController {
	
	@Autowired
	private ChatRepository repository;
	
	
	@RequestMapping(value="/listarMensajes", method=RequestMethod.GET)
	public List<Mensaje> getMensajes(){
		List<Mensaje> lista = repository.findAll();
		if (lista.isEmpty()){
			return null;
		}
		return lista;
	}
	
	@RequestMapping(value = "/guardarMensaje", method = RequestMethod.POST)
	public void crearMensaje(@RequestBody Mensaje mensaje){
		repository.saveAndFlush(mensaje);
	}

}
