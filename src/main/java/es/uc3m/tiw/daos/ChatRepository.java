package es.uc3m.tiw.daos;




import org.springframework.data.jpa.repository.JpaRepository;

import es.uc3m.tiw.dominios.Mensaje;

public interface ChatRepository extends JpaRepository<Mensaje, Long>{
	

}
