package ul.programacionVII.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ul.programacionVII.Entidades.ContenidoEntidad;

public interface ContenidoRepositorio extends JpaRepository<ContenidoEntidad, Long>{
	
}
