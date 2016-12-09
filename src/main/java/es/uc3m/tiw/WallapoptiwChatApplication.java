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
		
		Mensaje mensaje1 = new Mensaje("ESTO ES UN MENSAJE DE PRUEBA","MANUEL@HOTMAIL.COM","CAROLINA@HOTMAIL.COM");
		
		repository.saveAndFlush(mensaje1);
		
	}
}
