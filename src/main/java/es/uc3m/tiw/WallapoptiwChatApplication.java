package es.uc3m.tiw;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.uc3m.tiw.daos.ChatRepository;
import es.uc3m.tiw.dominios.Mensaje;

@SpringBootApplication
public class WallapoptiwChatApplication {

	
	@Autowired
	private ChatRepository repository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(WallapoptiwChatApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		
		Mensaje mensaje1 = new Mensaje("MENSAJE DE PRUEBA 1","manuel@hotmail.com","carolina@hotmail.com");
		Mensaje mensaje2 = new Mensaje("MENSAJE DE PRUEBA 2","otrosin@hotmail.com","carolina@hotmail.com");
		Mensaje mensaje3 = new Mensaje("MENSAJE DE PRUEBA 3","carolina@hotmail.com","manuel@hotmail.com");
		
		repository.saveAndFlush(mensaje1);
		repository.saveAndFlush(mensaje2);
		repository.saveAndFlush(mensaje3);
		
	}
}
